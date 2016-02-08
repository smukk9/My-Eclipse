package me.SpringTravel.src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String arg[]){
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("travel.xml","Travel2.xml");
		
		Traveler tr =(Traveler)(apc.getBean("id3"));
		tr.startJourney();
		
	
		
	}
}
	
	