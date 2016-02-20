package org.Hiberanate.main;

import org.Hiberanate.DTO.userDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class testClass {

	@SuppressWarnings("deprecation")
	public static void main(String arg[]) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("config.cfg.xml");
		
		SessionFactory sfc = cfg.buildSessionFactory();
		Session s = sfc.openSession();
		s.beginTransaction();
		
		userDetails user = (userDetails) s.get(userDetails.class, 5);
		//System.out.println("User Name is :" + user.getUser_Details());
		user.setUser_Details("newuser1");
		s.update(user);
		//s.delete(user);
//		for(int i =0;i<10;i++){
//			userDetails user = new userDetails();
//			user.setUser_Details("user"+i);
//		to CREATE
	//	s.save(user);
//		}
		
		
		s.getTransaction().commit();
		s.close();
		
		
	}
}
