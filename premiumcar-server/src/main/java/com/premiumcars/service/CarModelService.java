package com.premiumcars.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.premiumcars.entities.City;
import com.premiumcars.entities.Ownership;
import com.premiumcars.modal.DropDown;
import com.premiumcars.modal.DropDownlist;
import com.premiumcars.repository.CarModelRepository;

@Service
public class CarModelService {

	@Autowired
	private CarModelRepository carModelRepository;
	
	@Cacheable
	public DropDownlist getDropDownList() {
		DropDownlist dropDownlist = new DropDownlist();
		
		List<DropDown> response = new ArrayList<DropDown>();
		
		List<String> carMakerList = carModelRepository.findDistinctByCarMaker();

		carMakerList.forEach(carMaker -> {
			DropDown dropDown = new DropDown();
			dropDown.setKey(carMaker);
			dropDown.setData(carModelRepository.findDistinctModelNameByCarMaker(carMaker));
			response.add(dropDown);
		});

		//List<Ownership> ownerships = carModelRepository.findDistinctOwnership();

		List<City> cityList = carModelRepository.findDistinctCities();
		
		dropDownlist.setCities(cityList);
		//dropDownlist.setOwnership(ownerships);
		dropDownlist.setCarModelsList(response);

		return dropDownlist;

	}
	
	
}
