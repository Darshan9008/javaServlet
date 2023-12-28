package com.xworkz.scientistspring.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ScientistDTO {

	@NotNull
	@Size(min = 3, max = 20, message = "Please enter valid name")
	private String scientsitName;
	
	@NotNull
	private String field;
	

	@NotNull(message = "exp must not be empty")
	@Min(4)
	@Max(15)
	private int experience;
	
	
	@NotNull
	private String country;
	
	
	private String achievements;
	
}
