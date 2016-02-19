package org.sandeep.prodcon;

import java.util.Random;

public class Producer implements Runnable {	
	
		private int buffer [];
		private int size ;
	
	public Producer(int buffer[], int size){
		 this.buffer= buffer;
		this.size= size;
	}


@Override
public void run() {
	// TODO Auto-generated method stub
	int i;
	Random rand = new Random();
	
	for(i=0;i<size;i++){
		int ele =rand.nextInt(20)+30;
		System.out.println("producing an Element:" );
		buffer[i]= ele;
		
	}

}
}