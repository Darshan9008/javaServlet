package com.xworkz.springWebInit.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Beans {
	
	
	
	public Beans() {
	
		System.out.println("running beans() const is bean");
		// TODO Auto-generated constructor stub
	}
	
	
	@Bean
	public void palav() {
		System.out.println("running palav() in Beans");
	}

}
