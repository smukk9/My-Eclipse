package org.sandeep.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	@SuppressWarnings("resource")
	public static void main(String arg[]){

		//Triangle triangle = new Triangle();
		//Depreciated 
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Triangle triangle = (Triangle)(context.getBean("Triangle"));
		triangle.draw();
	}

}
