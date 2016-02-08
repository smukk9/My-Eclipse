package me.SpringTravel.src;
public class Bus implements Vehicle{

	private String fuel;
	private String speed;
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public void move() {
		// TODO Auto-generated method stub
		
		System.out.println("Bus is moving at "+speed+ "\n" + "with"+ fuel);
		
	}
	
	
	
}
