package com.xworkz.cloth;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/virat" , loadOnStartup = 1)
public class ClothServlet extends HttpServlet{
	
	public ClothServlet() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name=req.getParameter("name");
		String price=req.getParameter("price");
		String type=req.getParameter("type");
		
		/*int total1=price1*(100-discount1)/100;
			int total2=total1*quantity1;
			int total3= total2+gst1;
			*/
		
		req.setAttribute("name", name);
		req.setAttribute("price", price);
		req.setAttribute("type", type);
		
		
		if(!type.isEmpty()) {
			
			Integer type1=Integer.parseInt("type");
			Integer price1=Integer.parseInt("price");
			int total=price1*(100-type1)/100;
			
			req.setAttribute("total", total);
			
			req.setAttribute("name", name);
			req.setAttribute("price", price);
			req.setAttribute("type", type);
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("ClothSuccess.jsp");
			dispatcher.forward(req, resp);


			
			
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	

}
