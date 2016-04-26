package org.Ds.observer;

public class App {

	
	@SuppressWarnings("unused")
	public static void main(String arg[]) {
		
		weatherStation station = new  weatherStation();
		weatherObserver1 ob1 = new weatherObserver1(station);
		observer2 ob2 = new observer2(station);
		
		station.setTemparature(42);
		station.setPressure(72);
		station.setHumidity(45);
	}
	
	

}
