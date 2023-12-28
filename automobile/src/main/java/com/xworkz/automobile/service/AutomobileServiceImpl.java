package com.xworkz.automobile.service;

import java.util.List;

import com.xworkz.automobile.dto.VehicleDTO;
import com.xworkz.automobile.repository.AutomobileRepository;
import com.xworkz.automobile.repository.AutomobileRepositoryImpl;

public class AutomobileServiceImpl implements AutomobileService {

	AutomobileRepository repo = new AutomobileRepositoryImpl();

	public void validateAndSave(VehicleDTO vehicleDTO) {

		if (!vehicleDTO.getName().isBlank() && !vehicleDTO.getColor().isBlank() && vehicleDTO.getModel() != 0
				&& !vehicleDTO.getType().isBlank()) {

			repo.saveVehicleDetails(vehicleDTO);
			System.out.println("insert successfully");
		} else {
			System.out.println("invalid input");
		}

	}

	@Override
	public void validateAndSave(List<VehicleDTO> vehicleDTO) {

		repo.saveVehicleDetails(vehicleDTO);

	}

	@Override
	public void updateAndSave(VehicleDTO vehicleDTO) {

		repo.updateVehicleDetails(vehicleDTO);
	}

	@Override
	public void updateAndSave(List<VehicleDTO> vehicleDTO) {

		repo.updateVehicleDetails(vehicleDTO);

	}

	@Override
	public List<VehicleDTO> fetchAlldetails() {


		List<VehicleDTO> vehicles=repo.fetchAllDetails();
		for(VehicleDTO vehicleDTO: vehicles) {
			System.out.println(vehicleDTO.getName());
			System.out.println(vehicleDTO.getColor());
			System.out.println(vehicleDTO.getModel());
			System.out.println(vehicleDTO.getType());
		}
		
		
		return null;
	}

}
