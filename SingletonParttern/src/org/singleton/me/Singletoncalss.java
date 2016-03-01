package org.singleton.me;

//implementing using Enum is much better approach than a normal class.
//Threadsafe is the biggest advangtage of using Enum.
public enum Singletoncalss {
	
	INSTANCE;
	
	private int counter;

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	

}
