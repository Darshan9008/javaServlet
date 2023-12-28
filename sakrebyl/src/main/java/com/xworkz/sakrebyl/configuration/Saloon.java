package com.xworkz.sakrebyl.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Saloon {

	private Ajama ajama;
	
	@Autowired
	private Saloon(Ajama ajama) {
		this.ajama=ajama;
		System.out.println("saloon ref :"+this.ajama);
		
		
	}
	
}
