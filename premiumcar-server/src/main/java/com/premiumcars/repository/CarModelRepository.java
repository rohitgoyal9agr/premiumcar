package com.premiumcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.premiumcars.entities.CarModel;
import com.premiumcars.modal.DropDown;

@Repository
public interface CarModelRepository extends JpaRepository<CarModel, Long>{

	@Query("select distinct(carMaker) from CarModel")
	List<String> findDistinctByCarMaker();
	
	@Query("select DISTINCT new com.premiumcars.modal.DropDown(c.modelName) from CarModel c where c.carMaker in :carMaker")
	List<DropDown> findDistinctModelNameByCarMaker(String carMaker);
}

