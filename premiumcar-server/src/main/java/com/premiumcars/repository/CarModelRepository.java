package com.premiumcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.premiumcars.entities.CarModel;

@Repository
public interface CarModelRepository extends JpaRepository<CarModel, Long>{

}

