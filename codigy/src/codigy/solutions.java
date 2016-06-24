package codigy;

public class solutions {
	
	public int chcek(String a){
		
		String str[] = a.split("\\.|\\?|!");
		
		int sum2 =0;
		
		
		for(String r : str){

			int sum1 =0;
			String[] eachcheck = r.split(" ");
			
			for(String q : eachcheck){
				if(!q.isEmpty()){
					
					sum1 = sum1 +1;
				}
				
			}
			
			if(sum1 > sum2){
				
				sum2 = sum1;
			}
			
		}
		
		return sum2;
		
		
		
		
	}
	
	
	public static void main(String arg[]){
		
		solutions s = new solutions();
		String a = "We test coders. Give us a try?";
		int c =s.chcek(a);
		System.out.println(c);
	}
}
