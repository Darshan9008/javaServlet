package com.xworkz.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.AddressDTO;

@WebServlet(urlPatterns = "/virat", loadOnStartup = 1)
public class AddressServlet extends HttpServlet {
	
	private AddressDTO addressDTO;

	public AddressServlet() {
		System.out.println("created login servlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String no=req.getParameter("no");
		String state=req.getParameter("state");
		String street=req.getParameter("street");
		String country=req.getParameter("country");
		String city=req.getParameter("city");
		
		AddressDTO addressDTO=new AddressDTO(no, state, street, country, city);
		
		req.setAttribute("dto", addressDTO);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("AdressSuccess.jsp");
		dispatcher.forward(req, resp);




		
		
	}	
	
	
	

}
