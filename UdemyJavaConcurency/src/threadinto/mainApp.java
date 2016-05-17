package threadinto;

public class mainApp {
	
	public static void main(String args[]) throws InterruptedException {
		
		Thread t1 = new Thread(new Startthread());
		t1.start();
		
		Thread t2 = new Thread(new Startthread());
		t2.start();
		t1.join();
		t2.join();
	System.out.println("Im waiting");
	}
}
