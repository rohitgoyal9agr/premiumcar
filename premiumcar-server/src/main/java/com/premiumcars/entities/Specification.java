package com.premiumcars.entities;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="specification")
public class Specification {

	@Id
	@GeneratedValue
	private int specId;
	
	private String specType;
	private String specDesc;
	private String color;
	
	
	@OneToOne(mappedBy = "spec", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private Varient varient;
}
