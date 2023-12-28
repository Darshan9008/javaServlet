package com.xworkz.springWebInit.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Ragi {
	
	
	
	public Ragi() {
		
		System.out.println("running in ragi() const");
		// TODO Auto-generated constructor stub
	}
	
	@Bean
	public void mudde() {
		System.out.println("running mudde() in ragi");
	}

}
