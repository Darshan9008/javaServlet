package com.xworkz.sakrebyl.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Perfume {

	public Perfume() {

		System.out.println("perfume() const");
	}

}
