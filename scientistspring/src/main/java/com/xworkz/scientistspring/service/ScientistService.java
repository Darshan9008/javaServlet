package com.xworkz.scientistspring.service;

import org.springframework.stereotype.Service;

import com.xworkz.scientistspring.dto.ScientistDTO;



public interface ScientistService {
	
	public boolean validateAndSave(ScientistDTO dto);


}
