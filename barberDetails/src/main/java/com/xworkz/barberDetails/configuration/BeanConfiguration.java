package com.xworkz.barberDetails.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.barberDetails")
@Configuration
public class BeanConfiguration {
	
	
	public BeanConfiguration() {


		System.out.println("running bean configuration const created");
	}

}
