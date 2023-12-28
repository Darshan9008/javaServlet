package com.xworkz.sakrebyl.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Tile {
	
	
	
	private Perfume perfume;
	
	@Autowired
	public Tile(Perfume perfume) {

		this.perfume=perfume;
		System.out.println("perfume ref :"+this.perfume);
	}

}
