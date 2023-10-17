package com.xworkz.day;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/virat", loadOnStartup = 2)
public class DayServlet extends HttpServlet {
	
	
	public DayServlet() {

	System.out.println("created dayservlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String date=req.getParameter("date");
		String year=req.getParameter("year");
		String month=req.getParameter("month");
		String day=req.getParameter("day");
		
		
        req.setAttribute("date", date);
        req.setAttribute("year", year);
        req.setAttribute("month", month);
        req.setAttribute("day", day);
        
        RequestDispatcher dispatcher=req.getRequestDispatcher("DateSuccess.jsp");
        dispatcher.forward(req, resp);
        
        
        



        
        
		
		
		
	
		
	}
	
	
	

}
