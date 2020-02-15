package com.premiumcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.premiumcars.entities.Varient;

@Repository
public interface VarientRepository extends JpaRepository<Varient, Long>{

}
