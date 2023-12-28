package com.xworkz.webProjectServlet.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.webProjectServlet")
@Configuration
public class BeanConfiguration {

	public BeanConfiguration() {
		System.out.println("created BeanConfiguration");
	}
	
	
	
	

}
