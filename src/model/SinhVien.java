package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="sinhvien")
public class SinhVien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ma_sv")
	private int ma_sv;
	
	@Column(name ="hoten")
	private String hoten;
	
	@Column(name="namsinh")
	private String namsinh;
	
	@Column(name ="phai")
	private String phai;
	
	@Column(name="sodienthoai")
	private String sodienthoai;
	
	@Column(name="diachi")
	private String diachi;
	
	@Column(name="email")
	private String email;

	public int getMa_sv() {
		return ma_sv;
	}

	public void setMa_sv(int ma_sv) {
		this.ma_sv = ma_sv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(String namsinh) {
		this.namsinh = namsinh;
	}

	public String getPhai() {
		return phai;
	}

	public void setPhai(String phai) {
		this.phai = phai;
	}

	public String getSodienthoai() {
		return sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
