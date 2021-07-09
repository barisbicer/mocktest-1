package com.example.demo.entity;

public class EmployeeVO {
	
	private int id;
	
	private String ad;
	
	private String soyad;
	
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public EmployeeVO(int id, String ad, String soyad, String email) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.email = email;
	}
	
	public EmployeeVO() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
