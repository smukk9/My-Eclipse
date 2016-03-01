package org.singleton.me;

public class App {

	public static void main(String arg[]){
		
		Singletoncalss.INSTANCE.setCounter(10);
		System.out.println(Singletoncalss.INSTANCE.getCounter());
	}
}
