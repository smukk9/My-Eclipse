package duplicate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class App {

	public static void main(String args[]){
		
		Duputility dup = new Duputility();
		Scanner sc = new Scanner(System.in);
		List<List<Integer>> input_List = new ArrayList<>();
		List<Integer> input_List1 = new ArrayList<>();
		List<Integer> input_List2 = new ArrayList<>();
		List<Integer> input_List3 = new ArrayList<>(); 
		
		input_List1.add(2);
		input_List1.add(3);
		input_List1.add(4);
		input_List1.add(5);
		input_List1.add(2);
		input_List1.add(4);
		input_List1.add(2);
		
		input_List2.add(3);
		input_List2.add(4);
		input_List2.add(2);
		input_List2.add(5);
		input_List2.add(7);
		input_List2.add(8);
		
		input_List3.add(13);
		input_List3.add(12);
		input_List3.add(1);
		input_List3.add(3);
		input_List3.add(33);
		
		
		
		input_List.add(input_List1);
		input_List.add(input_List2);
		input_List.add(input_List3);
		
		
		
		
		
		
		Set<Integer> rep = dup.find_duplicates(input_List);
		Iterator<Integer> setit = rep.iterator();
		
		while(setit.hasNext()){
			System.out.println(setit.next());
		}
		sc.close();
		
	}
}
