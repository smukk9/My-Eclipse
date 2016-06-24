package CountDownlatches;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class maincntdl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exe = Executors.newSingleThreadExecutor();
		CountDownLatch cdlm = new CountDownLatch(5);
		
		for(int i=1; i<=5; i++)
				
			exe.execute(new countdownlatches(i,cdlm));
			
			try {
				/*
				 * await makes the current thread to wait until the countdown latch is 
				 * reached 0;	
				 */
				cdlm.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		System.out.println("all things done");
		
		exe.shutdown();
	}

}
