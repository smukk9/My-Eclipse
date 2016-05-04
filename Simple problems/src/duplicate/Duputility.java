
package duplicate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duputility {

	public Set<Integer> find_duplicates(List<List<Integer>> list){
		
		Set<Integer> Repeated = new HashSet<>();
		Set<Integer> unique = new HashSet<>();
		
		for(List<Integer> a : list){
			
			for(Integer ele: a)
				
			if(!unique.add(ele)){
				
				Repeated.add(ele);
			}
			
		}
		
	return unique;
	}
}
