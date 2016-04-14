package org.sandeep.prodcon;

import java.io.IOException;

public class App   {
	
	public static void main(String arg[])throws IOException, InterruptedException {

	
		
		System.out.println("**** Thread Starts ****\n");
		
		Thread t1 = new Thread(new Consumer("one"));
		t1.start();
		
		Thread t2 = new Thread(new Consumer("two"));
		t2.start();
		t1.join();
		t2.join();
		System.out.println("\n**** Thread completed ****");
	}

}
