package com.scp.java.Maven.HibernateMapping_O2O;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
// first change
// save
@Entity
@Table(name ="add_info")
public class Address {
	private String city;
	@Id
	private int pinCode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}
	public Address(String city, int pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
