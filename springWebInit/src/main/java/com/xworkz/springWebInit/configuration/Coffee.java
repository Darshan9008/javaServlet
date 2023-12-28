package com.xworkz.springWebInit.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Coffee {

	public Coffee() {
		System.out.println("running in coffee() const");
	}
	
	
	@Bean
	public void kuditiya() {
		System.out.println("running in Kuditiya() in coffee");
	}
	
	
}
