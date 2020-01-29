package com.premiumcars.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="city")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cityId;
	
	private String state;
	private String cityName;
	
	@OneToOne(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private Ownership ownership;
	
	@OneToOne(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private Car car;
	
	@OneToOne(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private User user;
	
	
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
		
}
