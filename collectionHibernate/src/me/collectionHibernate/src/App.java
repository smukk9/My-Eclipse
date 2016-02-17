package me.collectionHibernate.src;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	
	@SuppressWarnings("deprecation")
	public static void main(String arg[]){
		
		userDetails user = new userDetails();
		user.setUser_Name("Sandeep");
		
		Address adr1 = new Address();
		adr1.setCity("Hyderabad");
		adr1.setState("Ap");
		adr1.setStreet("Hydershakote");
		adr1.setPincode("90038");
		
		Address adr2 = new Address();
		adr2.setCity("Pune");
		adr2.setState("MP");
		adr2.setStreet("Jhansi");
		adr2.setPincode("5775");
		user.getList_Address().add(adr1);
		user.getList_Address().add(adr2);
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory ses = cfg.buildSessionFactory();
		Session s = ses.openSession();
		s.save(user);
		s.beginTransaction();
		s.getTransaction().commit();
		
		
	}
	

}
