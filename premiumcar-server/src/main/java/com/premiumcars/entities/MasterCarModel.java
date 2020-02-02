package com.premiumcars.entities;

import java.sql.Blob;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="master_car_model")
public class MasterCarModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer masterCarModelId;
	
	private String carMaker;
	private String modelName;
	private String carType;
	
	@OneToMany(mappedBy = "masterCarModel" , fetch = FetchType.LAZY)
	private List<MasterVarient> masterVarient;

	public Integer getCarModelId() {
		return carModelId;
	}

	public void setCarModelId(Integer carModelId) {
		this.carModelId = carModelId;
	}

	public String getCarMaker() {
		return carMaker;
	}

	public void setCarMaker(String carMaker) {
		this.carMaker = carMaker;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public List<Varient> getVarient() {
		return varient;
	}

	public void setVarient(List<Varient> varient) {
		this.varient = varient;
	}
	
}
