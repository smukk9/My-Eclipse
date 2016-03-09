package org.sevices.db;

import java.util.HashMap;

import org.services.dto.User;

public class MockDB {

	private HashMap<String, User> user_db = new HashMap<>();
	
	public MockDB(){
		
		User dummy = new User();
		dummy.setPassword("pass");
		dummy.setE_mail("sadfa");
		dummy.setCountry("usa");
		dummy.setUser_Name("sandeep");
		dummy.setPhone_Number(45125);
	
		
		user_db.put( "sandeep",dummy );
	}

	public HashMap<String, User> getUser_db() {
		return user_db;
	}

	public void setUser_db(HashMap<String, User> user_db) {
		this.user_db = user_db;
	}
	
	public boolean addDB(User user){
		
		user_db.put(user.getUser_Name(), user);
		return true;
	}
	
	//return the password to authinticate.
	public String getpwd(User user){
		
		
		String pwd = user.getPassword();
		return pwd;
	}
	
	public User getUser(String u_name){
		
		User userdummy = user_db.get(u_name);
		return userdummy;
		
		
		
	}
	
	
	
}