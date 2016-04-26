package org.Ds.observer;

import java.util.ArrayList;
import java.util.List;

public class weatherStation implements Subject{

	private int temparature;
	private int humidity;
	private int pressure;
	private List<Observer> ObserverList;
	
	public weatherStation(){
		
		this.ObserverList = new ArrayList<>();
	}
	

	public int getTemparature() {
		return temparature;
	}

	public void setTemparature(int temparature) {
		this.temparature = temparature;
		notifyallObservers();
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
		notifyallObservers();
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
		notifyallObservers();
	}

//methods that add,remove and notify the observers in the list
	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		this.ObserverList.add(o);
	}


	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		this.ObserverList.remove(ObserverList.indexOf(o));
	}


	@Override
	public void notifyallObservers() {
		// TODO Auto-generated method stub
		for(Observer a: ObserverList){
			
			a.updateobservers(this.temparature,this.pressure, this.humidity);
			
		}
		
	}

	
}
