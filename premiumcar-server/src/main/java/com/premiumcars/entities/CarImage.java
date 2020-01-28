package com.premiumcars.entities;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="car_image")
public class CarImage {

	@Id
	@GeneratedValue
	private int imageId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Car car;
	
	private Blob picture;
}
