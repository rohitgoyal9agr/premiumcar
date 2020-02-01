package com.premiumcars;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.premiumcars.service.CarModelService;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	CarModelService carModal;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(carModal.getDropDownList());
		
	}
}