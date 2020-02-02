package com.premiumcars.entities;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="masterSpecification")
public class MasterSpecification {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer specId;
	
	private String specType;
	private String specDesc;
	private String color;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private MasterVarient masterVarient;
}
