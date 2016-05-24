package pccondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * producer consumer implementation using condition(condition are methods that bundels the usage
 * of wait and notify on toa single method on top of lock interfac.
 * 
 * 
 * Note:
 * always first acquire the lock to call any lock realted methods like wait and signal
 */
public class PandC {

	
	public Lock lock = new ReentrantLock();
	public Condition condition = lock.newCondition();
	
	//producer
	public void produce() throws InterruptedException{
		
		lock.lock();
		System.out.println("producere");
		condition.await();
		Thread.sleep(2000);
		System.out.println("producer again");
		lock.unlock();
	}
	
	//consumer
	public void consumer() throws InterruptedException{
		
			lock.lock();
			Thread.sleep(2000);
			System.out.println("consumer");
			condition.signal();
			lock.unlock();
	}
	
	
	
	//main thread.
	public static void main(String args[]) {
		
		PandC pc = new PandC();
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stubw
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stubw
				try {
					pc.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		t1.start();
		t2.start();
	}
}
