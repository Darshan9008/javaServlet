package com.xworkz.milana.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.milana")
@Configuration
public class BeanConfiguration {

	public BeanConfiguration() {
		System.out.println("created bean configuration");
	}
	
	
	
	
	

}
