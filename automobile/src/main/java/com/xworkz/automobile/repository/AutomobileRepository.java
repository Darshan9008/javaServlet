package com.xworkz.automobile.repository;

import java.util.List;

import com.xworkz.automobile.dto.VehicleDTO;

public interface AutomobileRepository {
	
	
	public void saveVehicleDetails(VehicleDTO vehicleDTO);
	
	public void saveVehicleDetails(List<VehicleDTO> vechicleListDTO);
	
	public void updateVehicleDetails(VehicleDTO vehicleDTO);
	
	public void updateVehicleDetails(List<VehicleDTO> vechicleListDTO);
	
	List<VehicleDTO> fetchAllDetails();

	
	
	

}
