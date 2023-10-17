package com.xworkz.loan;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/virat",loadOnStartup=1)
public class LoanServlet extends HttpServlet{
	
	public LoanServlet() {
		System.out.println("created loan servlet");

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String lname=req.getParameter("lname");
		String amount=req.getParameter("amount");
		String work=req.getParameter("work");
		String interest=req.getParameter("interest");
		String surety=req.getParameter("surety");
		String company=req.getParameter("company");
		String duration=req.getParameter("duration");
		String type=req.getParameter("type");
		
		req.setAttribute("lname", lname);
		req.setAttribute("amount", amount);
		req.setAttribute("work", work);
		req.setAttribute("interest", interest);
		req.setAttribute("surety", surety);
		req.setAttribute("company", company);
		req.setAttribute("duration", duration);
		req.setAttribute("type", type);
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("LoanSuccess.jsp");
		dispatcher.forward(req, resp);
	
	}
	
	
	
	

}
