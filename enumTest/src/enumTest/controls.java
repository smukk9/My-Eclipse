package enumTest;

public enum controls {
	
	TEXT(1),
	DATE(2),
	PROGRESS(3),
	CONTACT(4);
	
	int prority; 
	
	controls(int p){
		this.prority = p;
	}
	
	public int getpriority(){
		return prority;
	}
}
