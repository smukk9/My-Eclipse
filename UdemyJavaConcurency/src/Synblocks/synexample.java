package Synblocks;

/*
 * Synchronized block will only lock on partucular object so that each
 * thread are  independent. that is. if one thread acquires the lock 
 * other thread can work on othermehtodd inseted of waiting.
 * 
 * T1-->gain lock1 and works on add();
 * while --> t1 agian lock lock2 and works on addagin();
 * 
 * there is no dead lock here as locks are independent to other and 
 * one can only accquite lock out of two s
 */
public class synexample {

	static int count1 = 0;
	static int count2 =0;
	private static Object lock1 = new Object();
	private static Object lock2 = new Object();	
	
	public static void add(){
	
		synchronized(lock1){
			System.out.println("lock1 aquired by:"+ Thread.currentThread().getName());
			
			count1++;
			System.out.println("count1: "+ count1);
		}
		
	}
	
	public static void addagain(){
		synchronized(lock2){
	System.out.println("lock2 aquired by"
			+ ":"+ Thread.currentThread().getName());
			
			count2++;
			System.out.println("count2: "+count2);
		}
		
	}
	
	public static void compute(){
		
		for(int i =0; i<10; i++){
			
			add();
			addagain();
		}
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				compute();
			}
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				compute();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("count1:"+count1 +"count2:"+count2 );
		System.out.println("---Finished---");
	}
	
}


