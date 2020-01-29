package com.premiumcars.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="company")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int companyId;
	
	private String companyName;
	}

