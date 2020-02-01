package com.premiumcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.premiumcars.entities.CarModel;

@Repository
public interface CarModelRepository extends JpaRepository<CarModel, Long>{

	@Query("select distinct(carMaker) from CarModel")
	List<String> findDistinctByCarMaker();
	
	@Query("select distinct(modelName) from CarModel where carMaker in :carMaker")
	List<String> findDistinctModelNameByCarMaker(String carMaker);
}

