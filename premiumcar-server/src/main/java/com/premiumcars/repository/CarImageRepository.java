package com.premiumcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.premiumcars.entities.CarImage;

@Repository
public interface CarImageRepository extends JpaRepository<CarImage, Long>{

}
