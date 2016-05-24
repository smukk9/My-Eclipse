package semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

enum Downloader{
	
	INSTANCE;
	
	/*
	 * 3-> int permit(no of threads to be allowed)
	 * tr-> boolean fairnes. no starving garunted if in case
	 * 
	 */
	public Semaphore semaphore = new Semaphore(2,true);
	
	public void Downloaddata() throws InterruptedException{
		//allows three threads to accquire and rest of themhas to stop.
		semaphore.acquire();
		download();
		semaphore.release();
		
	}

	private void download() {
		System.out.println("Download");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class semain {
	public static void main(String arg[]){
	ExecutorService execs = Executors.newCachedThreadPool();
	
	for(int i=0;i<12	; i++){
		
		execs.execute(new Runnable(){

			@Override
			public void run() {
				
				try {
					Downloader.INSTANCE.Downloaddata();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
	}
}
}

