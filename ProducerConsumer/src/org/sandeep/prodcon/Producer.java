package org.sandeep.prodcon;

public class Producer implements Runnable {

	@Override
	public void run() {
		
		for(int i=0;i<10; i++){
			
		System.out.println("i="+i);
				
	}	
	
		

}
}