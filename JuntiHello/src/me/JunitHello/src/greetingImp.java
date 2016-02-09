package me.JunitHello.src;

public class greetingImp implements Greetings {

	

	@Override
	public String greet(String name) {
		
		if(name==null|| name ==""){
		
				throw new IllegalArgumentException();
		}
		
		return ("Hello"+name);
		
	}

}
