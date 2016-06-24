package interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class cointype {
	
	public void process(Map<Coins, Integer> map	){
		
		Double sum = 0.00;
		
		Set<Coins> coinset = map.keySet();
		
		Iterator<Coins> it = coinset.iterator();
		
		while(it.hasNext()){
			
			Coins temp = it.next();
			int numcoins = map.get(temp);
			int i=0;
			while(i<numcoins){
			if(temp.equals(Coins.QUATER)){
				 
				sum = sum+0.25;
				i++;
			}
			if(temp.equals(Coins.DIME)){
				 
				sum = sum+0.10;
				i++;
			}
			
			if(temp.equals(Coins.NICKLE)){
				 
				sum = sum+0.05;
				i++;
			}
			
			if(temp.equals(Coins.PENNY)){
				 
				sum = sum+0.01;
				i++;
			}
			}
			
		}
		
		System.out.println("this is the sum"+ sum);
	}
	
	
	public static void main(String arg[]){
		
		Map<Coins, Integer> coinMap = new HashMap<>();
		coinMap.put(Coins.PENNY, 7);
		coinMap.put(Coins.DIME, 2);
		coinMap.put(Coins.NICKLE, 4);
		coinMap.put(Coins.QUATER, 1);
		cointype ct = new cointype();
		System.out.println("this is the sum");
		ct.process(coinMap);
	}
	
}
