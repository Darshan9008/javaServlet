package com.xworkz.webProjectServlet.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@RequestMapping("/")
public class ClickComponent {

	
	public ClickComponent() {

 
		System.out.println("created ClickComponent");
	}
	
	
	//@RequestMapping(value="/virat",method = RequestMethod.POST)
	@PostMapping("/virat")
	public String onClick(Model model) {
		
		System.out.println("click is working");
		model.addAttribute("email","darshan.xworkz@gmail.com");
		return "Index.jsp";
	}
	
	
}
