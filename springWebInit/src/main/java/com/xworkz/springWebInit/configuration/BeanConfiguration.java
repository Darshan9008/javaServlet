package com.xworkz.springWebInit.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springWebInit")
public class BeanConfiguration {

	public BeanConfiguration() {
		System.out.println("running BeanConfiguration ");
		}

}
