package com.xworkz.room.dto;

import java.io.Serializable;

public class RoomDTO implements Serializable  {
	private Integer id;
	private String country;
	private String state;
	private String city;
	private String location;
	
	public RoomDTO() {
		System.out.println(getClass().getName());
	}

	public RoomDTO(Integer id, String country, String state, String city, String location) {
		super();
		this.id = id;
		this.country = country;
		this.state = state;
		this.city = city;
		this.location = location;
	}

	@Override
	public String toString() {
		return "RoomDTO [id=" + id + ", country=" + country + ", state=" + state + ", city=" + city + ", location="
				+ location + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
	
	
	
	
	
	

}
