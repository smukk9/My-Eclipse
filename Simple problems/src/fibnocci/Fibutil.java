package fibnocci;

public class Fibutil {
	
	int sum =1;
	public int recfib(int n){
		
		if(n==0 ){
			
			
			return 0;
		}
		if(n==1){
			return 1;
		}
		
	 return recfib(n-1)+recfib(n-2);
		
		
		
	}
}
