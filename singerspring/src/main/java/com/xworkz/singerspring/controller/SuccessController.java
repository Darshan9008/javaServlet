package com.xworkz.singerspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SuccessController {
	
	public SuccessController() {
		// TODO Auto-generated constructor stub
		System.out.println("created success controller");
	}
	
	@PostMapping("yuvraj")
	public String succeed() {
		System.out.println("created succeed");
		return "SingerSuccess";
	}

}
