package com.xworkz.springWebInit.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Tea {

	
	public Tea() {
		System.out.println("running in Tea() const");

	}
	
	@Bean
	public void gingerTea() {
		System.out.println("running gingerTea() in Tea");
	}
}
