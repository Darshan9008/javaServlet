package com.xworkz.bloodspringpoc.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bloodspringpoc.dto.BloodDTO;

@Component
@RequestMapping("/")
public class SaveComponent {

	
	public SaveComponent() {
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping("/info")
	public String OnSaveComponent(BloodDTO dto ) {
		
		System.out.println("invoking onSave()  and details saved successfully");
		System.out.println("details for blood of a person :" +dto);
		return "Blood.jsp";
	}
}
