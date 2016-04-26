package org.Ds.observer;

@SuppressWarnings("unused")
public class observer2 implements Observer {

	private int temp;
	private int press;
	private int hum;
	private Subject sub;
	private String ObserverName = "ob2";
	
	public observer2(Subject s){
		
		this.sub = s;
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
