package com.xworkz.bakeryspring.component;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.bakeryspring.dto.CakeDTO;

@Component
@EnableWebMvc
@RequestMapping("/")
public class BakeryApplicationContext {
	
	public BakeryApplicationContext() {


		System.out.println("created BakeryApplicationContext ");
	}
	
	@PostMapping("/bake")
	public String saveDetails(Model model, @Valid CakeDTO cakeDTO, BindingResult errors) {
		System.out.println("saveDetails created..");
		System.out.println("Details of the CakeOredr:" + cakeDTO);
		System.out.println("Is CakeOredr dto not valid: " + errors.hasErrors());

		model.addAttribute("dto", cakeDTO);
		
		List<ObjectError> objectErrors = errors.getAllErrors();
		objectErrors.forEach(a -> System.err.println(a.getObjectName() + " " + a.getDefaultMessage()));

		model.addAttribute("error", objectErrors);
		return "CakeDetails";
	}


	
	
	
}
