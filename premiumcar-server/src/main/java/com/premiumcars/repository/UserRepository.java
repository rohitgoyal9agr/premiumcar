package com.premiumcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.premiumcars.entities.Ownership;
import com.premiumcars.entities.Specification;
import com.premiumcars.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
