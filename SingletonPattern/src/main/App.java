package main;

public class App {
	
	public static void main(String arg[]){
		
		Signleton obj1 = Signleton.getInstatnce();
		Signleton obj2 = Signleton.getInstatnce();
		Signleton obj3 = Signleton.getInstatnce();
		
		/**
		 * When all the object are printed we see that these will point to the same address
		 * or Same Hashcode.
		 */
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
	}
	
}
