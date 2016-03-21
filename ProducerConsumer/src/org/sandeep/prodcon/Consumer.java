package org.sandeep.prodcon;

public class Consumer implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int j =0; j<10;j++){
			
			System.out.println("j="+j);
		}
	}

	
	
	
}
