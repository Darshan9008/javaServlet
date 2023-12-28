package com.xworkz.sakrebyl.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Elevator {
	
	public Elevator() {

System.out.println("running elevator()");
	}
	
	private Perfume perfume;
	
	@Autowired
	public Elevator(Perfume perfume) {
		// TODO Auto-generated constructor stub
		
		this.perfume=perfume;
		System.out.println("perfume ref :"+this.perfume);
	}


}
