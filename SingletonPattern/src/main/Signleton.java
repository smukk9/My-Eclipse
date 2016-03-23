package main;

/**
 * 
 * @author Sandeep
 * made the instace static so that it can be accessed anywhere with out theobject.
 * using getter only one instace of object is made .
 *
 */
public class Signleton {

	private static Signleton  Instance = null;

	public static Signleton getInstatnce() {
		if(Instance == null)	{
			
			return Instance = new Signleton();
		}
		else
			return Instance;
	}

	public int add (int a, int b){
		
		int c = a+b;
		return c;
	}
	
}
