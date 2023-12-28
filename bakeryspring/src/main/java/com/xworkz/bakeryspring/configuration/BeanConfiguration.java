package com.xworkz.bakeryspring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.bakeryspring")
@EnableWebMvc
public class BeanConfiguration {
	
	public BeanConfiguration() {


		System.out.println("created BeanConfiguration ");
	}
	
	@Bean
	public ViewResolver viewResolver() {
		
		ViewResolver resolver=new InternalResourceViewResolver("/", ".jsp");
		return resolver;
		
	}
	
	
	

}
