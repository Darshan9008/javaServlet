package com.xworkz.sakrebyl.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Stamp {
	
	private Bulb bulb;
	
	@Autowired
	public Stamp(Bulb bulb) {

     System.out.println("created stamp() const");
     this.bulb=bulb;
     System.out.println("bulb ref :" +this.bulb);
	}

}
