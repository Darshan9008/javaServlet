package com.xworkz.sakrebyl.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Generator {
	
	
	public  Generator() {
		System.out.println("generate method in generator()");
	}

}
