package org.services.Auth;

import org.services.dto.User;
import org.sevices.db.MockDB;

public class Authservices {

	public boolean Authenticate(String u_name, String pas){
			
		MockDB check = new MockDB();
		
		User checkuser = check.getUser(u_name);
		String p_word= check.getpwd(checkuser);;
		
		if(p_word == pas){
			
			return true;
		}
		
		return false;
	}
	
}
