package prodconsumer;

import java.io.IOException;
import java.util.LinkedList;

public class prodcon {

	public LinkedList<Integer> list = new LinkedList<>();
	private Object lock = new Object();
	public int Max = 10;
	int value =0;

	int ran = 0;
	
	
	public void producer() throws InterruptedException{
		while(ran<50){
			synchronized(lock){

				while(list.size()==Max){

					lock.wait();
				}

					this.list.add(value);
					System.out.println("Produced--- "+ value);
					value++;
					lock.notify();
				
				
			}
			
			ran++;
		}

	}

	public void consumer() throws InterruptedException{

		while (ran<50)
		{
			synchronized(lock){

				while(list.size()==0){

					lock.wait();
				}

					int temp = this.list.remove();
					System.out.println("Consumner---"+ temp );
					lock.notify();
				
					Thread.sleep(100);
			}
		}

	}

	public static void main(String [] args) throws IOException, InterruptedException{
		prodcon pc = new prodcon();
		Thread pro = new Thread(new Runnable(){

			public void run(){

				try {
					pc.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread con= new Thread(new Runnable(){

			public void run(){

				try {
					pc.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		pro.start();
		con.start();
		pro.join();
		con.join();
		System.out.println("--finished--");
	}


}
