package com.premiumcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.premiumcars.entities.Ownership;

@Repository
public interface OwnershipRepository extends JpaRepository<Ownership, Long>{

}
