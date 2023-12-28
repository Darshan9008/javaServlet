package com.xworkz.automobile.service;

import java.util.List;

import com.xworkz.automobile.dto.VehicleDTO;

public interface AutomobileService {
	
	public void validateAndSave(VehicleDTO vehicleDTO);
	
	public void validateAndSave(List<VehicleDTO> vehicleDTO);
	
	public void updateAndSave(VehicleDTO vehicleDTO);
	
	public void updateAndSave(List<VehicleDTO> vehicleDTO);

	List<VehicleDTO> fetchAlldetails();
	

}
