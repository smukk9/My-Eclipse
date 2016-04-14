package org.sandeep.prodcon;

public class Consumer implements Runnable{
	public String threadName;
	public int x[] = new int[5];

	public int counter=0 ;
	public Consumer(String name){
		this.threadName = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub 
		synchronized(this){
		produce();
		}

	}

	private void produce() {
			
		
					
			for(int i=0; i<x.length;i++){
					int value = (int) (Math.random()*100+1);
					x[i]=value;
					counter++;
					System.out.println(x[i]+ " counter "+ counter+"->"+this.threadName);
					

				}
				
			
			
	}
		
			}

		
	





