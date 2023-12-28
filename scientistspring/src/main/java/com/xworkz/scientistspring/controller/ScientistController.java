package com.xworkz.scientistspring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.scientistspring.dto.ScientistDTO;
import com.xworkz.scientistspring.service.ScientistService;


@Controller
@RequestMapping("/")
public class ScientistController {
	
	@Autowired
	private ScientistService scientistService;
	
	public ScientistController() {
		System.out.println("Created ScientistController");
		}
		
		@PostMapping("/science")
		public String scientistController(@Valid ScientistDTO dto,Model model,BindingResult error) {
			System.out.println("Invoking learn().....");
			System.out.println("Is ScientistDTO is valid :" + error.hasErrors());

			model.addAttribute("dto", dto);
			if (error.hasErrors()) {
				List<ObjectError> objectErrors = error.getAllErrors();
				objectErrors.forEach(e -> System.err.println(e.getObjectName() + ":message " + e.getDefaultMessage()));
				model.addAttribute("errors", objectErrors);
				return "ScientistDetails";
			} else {
				boolean saved = this.scientistService.validateAndSave(dto);

				if (saved) {
					System.out.println("ScientistDTO:" + dto);
					model.addAttribute("msg", "Scientist details save successfully");
				} else {
					model.addAttribute("msg", "Scientist details not save successfully");
				}
			}
			return "success";
		}
		
	


}
