package tes_hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "siswa")
public class siswa {

	@Id
	@GeneratedValue
	private int no_induk;
	
	private String nama_siswa;

	public int getNo_induk() {
		return no_induk;
	}

	public void setNo_induk(int no_induk) {
		this.no_induk = no_induk;
	}

	public String getNama_siswa() {
		return nama_siswa;
	}

	public void setNama_siswa(String nama_siswa) {
		this.nama_siswa = nama_siswa;
	}
}
