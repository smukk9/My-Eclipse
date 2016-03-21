package org.sandeep.prodcon;

import java.io.Serializable;

public class App implements Serializable  {
	
	public static void main(String arg[]) {
		
	
	
	Producer prod = new Producer();
	new Thread(prod).start();
	
	Consumer com = new Consumer();
	new Thread(com).start();
	
	}

}
