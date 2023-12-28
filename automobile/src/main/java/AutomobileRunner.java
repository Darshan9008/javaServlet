import java.util.ArrayList;
import java.util.List;

import com.xworkz.automobile.dto.VehicleDTO;
import com.xworkz.automobile.repository.AutomobileRepository;
import com.xworkz.automobile.repository.AutomobileRepositoryImpl;
import com.xworkz.automobile.service.AutomobileService;
import com.xworkz.automobile.service.AutomobileServiceImpl;

public class AutomobileRunner {

	public static void main(String[] args) {
		
		VehicleDTO dto=new VehicleDTO("Nexon", "Black", "SUV", 2020);
		
		AutomobileRepository repo=new AutomobileRepositoryImpl();
		
		AutomobileService service=new AutomobileServiceImpl();
		service.validateAndSave(dto);
		
		List<VehicleDTO> vehicle=new ArrayList<VehicleDTO>();
		
		vehicle.add(dto);
		service.validateAndSave(vehicle);
		VehicleDTO dto1=new VehicleDTO("Nexon", "BLACK", "suv", 2023);
		service.updateAndSave(dto1);
		
		
		service.updateAndSave(dto1);

		service.fetchAlldetails();
		
		
		
		
		
	}

}
