package org.Hiberanate.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity	
public class userDetails {
	
	private String user_Details;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int user_Id;
	
	public String getUser_Details() {
		return user_Details;
	}
	public void setUser_Details(String user_Details) {
		this.user_Details = user_Details;
	}
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	

}
