package org.services.dto;

public class User {

	private String user_Name;
	private int phone_Number;
	private String E_mail;
	private String country;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public int getPhone_Number() {
		return phone_Number;
	}
	public void setPhone_Number(int phone_Number) {
		this.phone_Number = phone_Number;
	}
	public String getE_mail() {
		return E_mail;
	}
	public void setE_mail(String e_mail) {
		E_mail = e_mail;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	
	
}
