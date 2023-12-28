package com.xworkz.sakrebyl.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Temple {
	
	
	private Generator generator;
	private Tile tile;
	private Elevator elevator;
	
	@Autowired
	public Temple(Generator generator,Tile tile,Elevator elevator) {

		System.out.println("running temple() const");
		this.generator=generator;
		this.tile=tile;
		this.elevator=elevator;
		System.out.println("generator ref : "+this.generator);
		System.out.println("tile ref : " +this.tile);
		System.out.println("elevtor reff :"+this.elevator );
	}

}
