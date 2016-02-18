package me.collectionHibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class vehicle {

	private String vehicle_Name;
	@Id @GeneratedValue(strategy= GenerationType.AUTO)
	private int vehicle_Id;
	public String getVehicle_Name() {
		return vehicle_Name;
	}
	public void setVehicle_Name(String vehicle_Name) {
		this.vehicle_Name = vehicle_Name;
	}
	public int getVehicle_Id() {
		return vehicle_Id;
	}
	public void setVehicle_Id(int vehicle_Id) {
		this.vehicle_Id = vehicle_Id;
	}
	
}
