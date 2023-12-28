package com.xworkz.sakrebyl.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Radio {
	
	private Generator generator;
	
	@Autowired
	public Radio(Generator generator) {

		System.out.println("running radio() const in Radio");
		this.generator=generator;
		System.out.println("generator ref :"+this.generator);
	}
	
	
	
	
	
	

}
