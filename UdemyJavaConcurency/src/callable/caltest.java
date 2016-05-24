package callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class caltest implements Callable<String> {

	
	public int id;
	
	public caltest(int id){
		this.id = id;
	}
	
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		return "id:"+id;
	}	
	
	public static void main(String args[]) throws InterruptedException, ExecutionException {
		
		
		
		List<Future<String>> list = new ArrayList<>();
		ExecutorService exe = Executors.newFixedThreadPool(2);
		
		for(int i=0; i <5 ;i++)
		{
			Future<String> ftr =exe.submit(new caltest(i+1));
			list.add(ftr);
			
		}
		
		for(Future<String> s : list){
			
			System.out.println(s.get());
		}
		


}
}
