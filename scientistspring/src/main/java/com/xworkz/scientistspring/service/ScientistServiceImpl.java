package com.xworkz.scientistspring.service;

import org.springframework.stereotype.Service;

import com.xworkz.scientistspring.dto.ScientistDTO;

@Service
public class ScientistServiceImpl implements ScientistService {

	@Override
	public boolean validateAndSave(ScientistDTO dto) {


		System.out.println("fields are validated");
		System.out.println("dto is saved "+dto);
		
		return true;
	}
		
	
	
	

}
