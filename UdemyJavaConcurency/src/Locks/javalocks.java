package Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class javalocks {

	public static int counter =0;
	
	/*
	 * A reentrant lock will make sure there is no starving when many threads are wait
	 * for thw locks. it garuntee that. this happens only if the fairness parameter is set to true. 
	 */
	private Lock lock = new ReentrantLock();
	

	public void add(){

		lock.lock();
		counter++;
		lock.unlock();
	}

	public void first(){

		for(int i=0;i<1000;i++){
			add();
		}
	}
	



	public static void main(String arg[]) throws InterruptedException{
		
		javalocks jj = new javalocks();
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				jj.first();
			}
			
		});
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				jj.first();
			}
			
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(counter);
		

	}
}
