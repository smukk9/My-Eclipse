package CountDownlatches;

import java.util.concurrent.CountDownLatch;


public class countdownlatches implements Runnable {

	private int id;
	private CountDownLatch cdl;

	public  countdownlatches(int id, CountDownLatch cdl){

		this.id = id;
		this.cdl = cdl;
	}

	public void run(){
		
		doWork();
		this.cdl.countDown();


	}

		//micks the thread working
	public void doWork() {
		System.out.println("thread id:"+ this.id +" is working.");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



	
}
