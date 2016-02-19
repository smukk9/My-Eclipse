package org.sandeep.prodcon;

public class App {
	int Size =10;
	int buffer[];
	
	Thread produce = new Thread(new Producer(buffer[], Size),"Producer");

}
