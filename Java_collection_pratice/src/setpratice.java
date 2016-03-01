import java.util.HashSet;
import java.util.Set;

public class setpratice<T>{

		Set<T> list = new HashSet<>();
		
		
	public  void addelement(T x){
		
		list.add(x);
		
	}
	
//	public T getElement(int  x){
//	
//			return list.get(x);
//	}
		
		
		
		public void printMe( )
		{
			for(T t: list)
			System.out.println(t);
		}
		
		
		

	
}
