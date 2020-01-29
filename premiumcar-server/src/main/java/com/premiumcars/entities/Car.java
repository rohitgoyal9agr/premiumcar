package com.premiumcars.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer carNumber;

	@OneToOne(fetch = FetchType.LAZY)
	private Company carMaker;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "car_model_id")
	private CarModel carModel;

	private Integer manufacturingYear;
	private Integer pastRunInKm;
	private Integer expectedPrice;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city_id")
	private City city;

	private Integer fuelEfficency;
	private String engineNumber;
	private String chesisNumber;

	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	private Ownership owner;

	@OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
	private List<CarImage> carImage;

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public CarModel getCarModel() {
		return carModel;
	}

	public void setCarModel(CarModel carModel) {
		this.carModel = carModel;
	}

	public int getManufacturingYear() {
		return manufacturingYear;
	}

	public void setManufacturingYear(int manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public int getFuelEfficency() {
		return fuelEfficency;
	}

	public void setFuelEfficency(int fuelEfficency) {
		this.fuelEfficency = fuelEfficency;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getChesisNumber() {
		return chesisNumber;
	}

	public void setChesisNumber(String chesisNumber) {
		this.chesisNumber = chesisNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Ownership getOwner() {
		return owner;
	}

	public void setOwner(Ownership owner) {
		this.owner = owner;
	}

	public List<CarImage> getCarImage() {
		return carImage;
	}

	public void setCarImage(List<CarImage> carImage) {
		this.carImage = carImage;
	}

}
