package com.cg.project.beans;

import java.io.Serializable;

public class Address implements Serializable {
	String city,country;
	public Address() {}
	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
