package com.xworkz.singerspring.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ClickController {

	
	public ClickController() {
		// TODO Auto-generated constructor stub
		System.out.println("created click controller");
	}
	
	@PostMapping("nadal")
	public String onClick() {
		
		System.out.println("invoking onclick");
		return "index";
		
		
	}
}
