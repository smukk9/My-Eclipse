package waitandnotify;

public class app {

	
	public void produce() throws InterruptedException{
		synchronized(this){
		System.out.println("producer");
		wait();
		System.out.println("producer after wait");
		}
	}
	
public void consume() throws InterruptedException{
		synchronized(this){
		System.out.println("consumer");
		Thread.sleep(2000);
		notify();
	}
}
	
public static void main(String arg[]) throws InterruptedException{
	
	app ap = new app();
	Thread t1 = new Thread(new Runnable(){

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				ap.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	});
	
	Thread t2 = new Thread(new Runnable(){

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				ap.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	});
	
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.println("--finished--");
	}
}
