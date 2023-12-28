package com.xworkz.bloodspringpoc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.bloodspringpoc")
@Configuration
public class BeanConfiguration {
	
	public BeanConfiguration() {
		System.out.println("running bean configuration");
		// TODO Auto-generated constructor stub
	}
	
	
	

}
