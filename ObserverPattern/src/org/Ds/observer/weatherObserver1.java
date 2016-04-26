package org.Ds.observer;

@SuppressWarnings("unused")
public class weatherObserver1 implements Observer {

	private int temp;
	private int press;
	private int hum;
	private Subject sub;
	private String ObserverName = "ob1";
	
	public weatherObserver1(Subject s){
		
		this.sub = s;
		
		//class adds itself to the observerlist in the weatherstationclass.
		this.sub.addObserver(this);
	}
	
	@Override
	public void updateobservers(int Temparature, int pressure, int Humidity) {
		// TODO Auto-generated method stub
		
		this.temp = Temparature;
		this.press = pressure;
		this.hum = Humidity;
		System.out.println("ob1:"+ ObserverName +"is updated.");
	}
	
	

}
