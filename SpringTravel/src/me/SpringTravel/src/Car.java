package me.SpringTravel.src;
public class Car implements Vehicle {

	
	private String carType;
	private int mileage;
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public void move() {
		// TODO Auto-generated method stub
		
		System.out.println(carType+"car had mileage of"+mileage);
	}
	
}
