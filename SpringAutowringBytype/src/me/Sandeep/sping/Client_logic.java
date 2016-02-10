package me.Sandeep.sping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client_logic {

	public static void main(String arg[]){
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("spring.xml");
		Catagories ct = (Catagories)(apc.getBean("id1"));
		ct.show();
	}
}
