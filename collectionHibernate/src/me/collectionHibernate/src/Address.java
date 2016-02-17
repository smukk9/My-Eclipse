package me.collectionHibernate.src;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable 
public class Address {

	@Column(name="Street_Name")
	public String street;
	@Column(name="City_Name")
	public String city;
	@Column(name="State_Name")
	public String state;
	@Column(name="Pim_Code")
	public String pincode;

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
