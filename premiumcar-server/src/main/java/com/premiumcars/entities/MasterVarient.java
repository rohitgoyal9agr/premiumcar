package com.premiumcars.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="masterVarient")
public class MasterVarient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer varientId;
	
	private String varientName;
	private String transmissionType;
	private String fuelType;
	
	@OneToMany(mappedBy = "masterVarient", fetch = FetchType.LAZY)
	private List<MasterSpecification> spec;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private MasterCarModel masterCarModel;
}
