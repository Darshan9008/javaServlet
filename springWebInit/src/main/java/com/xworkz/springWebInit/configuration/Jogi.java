package com.xworkz.springWebInit.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Jogi {

	public Jogi() {

		System.out.println("running in jogi() const");
	}
	
	@Bean
	public void longi() {
		System.out.println("running long() in jogi");
	}

}
