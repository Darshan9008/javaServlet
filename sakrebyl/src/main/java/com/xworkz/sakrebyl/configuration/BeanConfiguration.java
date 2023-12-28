package com.xworkz.sakrebyl.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.sakrebyl")
@Configuration
public class BeanConfiguration {
	
	public BeanConfiguration() {
     System.out.println("created BeanConfiguration()");
	}
	
	//@Bean
	public Bottle bottle() {
		Bottle bottle=new Bottle();
		return bottle;
	}
	
	@Bean
	public Bulb bulb() {
		Bulb bulb=new Bulb();
		return bulb;
	}
	
	@Bean
	public Elevator elevator(Perfume perfume) {
		Elevator elevator=new Elevator(perfume);
		return elevator;
	}
	
	
	@Bean
	public Generator generator() {
		Generator generator=new Generator();
		return generator;
	}
	
	public Perfume perfume() {
		Perfume perfume=new Perfume();
		return perfume;
	}
	
	@Bean
	public Scissor scissor() {
		return new Scissor();
	}
	
	@Bean
	
	public Scissor blade() {
		return new Scissor();
	}
	
	
	
	
	

}
