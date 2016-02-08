package me.SpringMap.src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String arg[]){
	ApplicationContext app = new ClassPathXmlApplicationContext("srping.xml");
	welomeBean wb = (welomeBean)(app.getBean("id1"));
	wb.show();
	
	}
			
}
