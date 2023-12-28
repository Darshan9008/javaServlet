package com.xworkz.sakrebyl.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Microwave {
	
	private Bulb bulb;
	private Radio radio;
	
	@Autowired
	public Microwave(Bulb bulb,Radio radio) {
		
		this.bulb=bulb;
		this.radio=radio;
		System.out.println("bulb ref :"+this.bulb);
		System.out.println("radio ref :"+this.radio);
		// TODO Auto-generated constructor stub
	}
	
	

}
