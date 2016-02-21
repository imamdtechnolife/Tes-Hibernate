package tes_hibernate;
import java.util.Date;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class kelas_utama {
	public static void main(String[]args)
	{
		System.out.println("Proses sedang berlangsung . . .");
		
		siswa siswaObj = new siswa();
		siswaObj.setNama_siswa("Selvia Andriani");
		
		detail_siswa detailSiswaObj = new detail_siswa();
		detailSiswaObj.setNo_hp("081916912392");
		
		detailSiswaObj.setSiswa(siswaObj);
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(siswaObj);
		session.save(detailSiswaObj);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		System.out.println("proses selesai :)");
	}
}
