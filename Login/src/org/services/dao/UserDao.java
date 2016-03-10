package org.services.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.services.dto.User;
import org.services.hibernateutil.HibernateUtil;

public class UserDao {


	public boolean add_user( String password, String u_name, String E_mail, Long p_num, String country){
		try{
			//load configruration file

			Session session = HibernateUtil.getSessionfactory().openSession();
			//create a transaction
			Transaction trans = session.beginTransaction();

			User user = new User();
			user.setUser_Name(u_name);
			user.setPassword(password);
			user.setE_mail(E_mail);
			user.setPhone_Number(p_num);
			user.setCountry(country);
			session.save(user);
			trans.commit();
			session.close();
			return true;
		}
		catch(Exception e){

			e.printStackTrace();
			return false;
		}
		

	}

	public User userExists(String u_name){

		Session session = HibernateUtil.getSessionfactory().openSession();
	//	Transaction trans = session.beginTransaction();
		Query querry = session.createQuery("from User where user_Name = :username");
		
		querry.setString("username", u_name);
		
		@SuppressWarnings("unchecked")
		List<User> r =(List<User>)querry.list();
		
		
		if(r!=null){
			
			return r.get(0);
		}else{
			return null;
		}
		
		
	}















}
