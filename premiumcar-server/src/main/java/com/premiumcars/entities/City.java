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
		
}
