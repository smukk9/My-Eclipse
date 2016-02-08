package me.SpringTravel.src;

public class Traveler implements Journey {

	private Vehicle v;
	public void setTraveler(Vehicle v){
		this.v=v;
	}
	@Override
	public void startJourney() {
		// TODO Auto-generated method stub
	
		v.move();
	}

}
