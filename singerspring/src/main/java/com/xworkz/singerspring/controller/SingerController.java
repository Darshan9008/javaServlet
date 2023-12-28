package com.xworkz.singerspring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;

import com.xworkz.singerspring.dto.SingerDTO;
import com.xworkz.singerspring.service.SingerService;

@Controller
@RequestMapping("/")
public class SingerController {
	
	@Autowired
	private SingerService service;
	
	public SingerController() {
		// TODO Auto-generated constructor stub
		System.out.println("invoking singer controler");
	}
	
	@PostMapping("virat")
	public String save(@Valid SingerDTO dto,BindingResult error,Model model) {
		
		System.out.println("invoking save in controller");
		System.out.println("is singer dto is valid"+error.hasErrors());
		
		model.addAttribute("dto",dto);
		if(error.hasErrors()) {
		
			List<ObjectError> objectErrors=error.getAllErrors();
			objectErrors.forEach(e->System.out.println(e.getObjectName() +":message" +e.getDefaultMessage()));
			model.addAttribute("error", objectErrors);
			
			return "Singer";
		}
		else {
			boolean saved=this.service.validateAndSave(dto);
			
			if(saved) {
				System.out.println("dto is passes"+dto);
				model.addAttribute("msg", "message saved successfully");
			}
			else {
				model.addAttribute("msg", "message not saved");
			}
		}
		
		return "SingerSuccess";    
		
		
		
	}

}
