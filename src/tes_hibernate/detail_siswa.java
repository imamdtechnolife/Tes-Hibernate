package tes_hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detail_siswa")
public class detail_siswa {
	
	@Id
	@GeneratedValue
	private int no_induk;
	
	private String no_hp;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "no_induk")
	private siswa siswa;

	public int getNo_induk() {
		return no_induk;
	}

	public void setNo_induk(int no_induk) {
		this.no_induk = no_induk;
	}

	public String getNo_hp() {
		return no_hp;
	}

	public void setNo_hp(String no_hp) {
		this.no_hp = no_hp;
	}

	public siswa getSiswa() {
		return siswa;
	}

	public void setSiswa(siswa siswa) {
		this.siswa = siswa;
	}

}
