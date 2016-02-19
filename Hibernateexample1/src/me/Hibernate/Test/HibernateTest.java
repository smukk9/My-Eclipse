package me.Hibernate.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import me.Hibernate.first.userDetails;

public class HibernateTest {

	@SuppressWarnings("deprecation")
	public static void main(String arg[]) {
		
		userDetails ud2 = new userDetails();
		ud2.setStudentName("sandeep");
		ud2.setStudentID(1);

		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sfc = cfg.buildSessionFactory();
		Session s = sfc.openSession();
		s.save(ud2);
		s.beginTransaction();
		s.getTransaction().commit();
	}
}
