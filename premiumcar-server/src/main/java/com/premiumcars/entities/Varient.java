package com.premiumcars.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="varient")
public class Varient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer varientId;
	
	private String varientName;
	private String transmissionType;
	private String fuelType;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "spec_id")
	private Specification spec;
	
	@OneToOne(mappedBy = "varient", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private CarModel carModel;
}
