package com.premiumcars.entities;

import java.sql.Blob;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="car_model")
public class CarModel {

	@Id
	@GeneratedValue
	private int carModelId;
	
	private String carMaker;
	private String modelName;
	private String carType;
	private Blob modelImage;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "varient_id")
	private Varient varient;
	
	@OneToOne(mappedBy = "carModel", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private Car car;
	
}
