package tes_hibernate;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="mahasiswa")
public class tes {

	@Id 
	private int nim;
	
	@Column(name="Nama_Mahasiswa", nullable=false)
	private String nama_mahasiswa;
	
	//@Transient
	@Temporal(TemporalType.DATE)
	private Date tanggal;
	
	
	public Date getTanggal() {
		return tanggal;
	}
	public void setTanggal(Date tanggal) {
		this.tanggal = tanggal;
	}
	public int getNim() {
		return nim;
	}
	public void setNim(int nim) {
		this.nim = nim;
	}
	public String getNama_mahasiswa() {
		return nama_mahasiswa;
	}
	public void setNama_mahasiswa(String nama_mahasiswa) {
		this.nama_mahasiswa = nama_mahasiswa;
	}
	
	public void pesanSingkat()
	{
		System.out.println("segala puji bagi allah:)");
	}
	
}
