package threadinto;

public class Startthread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++){
			
			System.out.println(i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}

