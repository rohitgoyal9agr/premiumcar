package com.premiumcars.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.premiumcars.modal.DropDownlist;
import com.premiumcars.repository.CarModelRepository;

@Service
public class CarModelService {

	@Autowired
	private CarModelRepository carModelRepository;
	
	@Cacheable
	public List<DropDownlist> getDropDownList() {
		
		List<DropDownlist> response = new ArrayList<DropDownlist>();
		
		List<String> carMakerList = carModelRepository.findDistinctByCarMaker();

		carMakerList.forEach(carMaker -> {
			DropDownlist dropDownlist = new DropDownlist();
			dropDownlist.setKey(carMaker);
			dropDownlist.setValue(carModelRepository.findDistinctModelNameByCarMaker(carMaker));
			response.add(dropDownlist);
		});

		return response;

	}
}
