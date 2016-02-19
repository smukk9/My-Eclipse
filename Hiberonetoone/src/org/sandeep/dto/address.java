package org.sandeep.dto;

import javax.persistence.Embeddable;

@Embeddable


public class address {
	
	private String city_Name;
	private String street_Name;
	private String zip_code;
	private String state_name;
	public String getCity_Name() {
		return city_Name;
	}
	public void setCity_Name(String city_Name) {
		this.city_Name = city_Name;
	}
	public String getStreet_Name() {
		return street_Name;
	}
	public void setStreet_Name(String street_Name) {
		this.street_Name = street_Name;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	
	

}
