package com.xworkz.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.contact.dto.ContactDTO;


@WebServlet(urlPatterns = "/virat" ,loadOnStartup = 1)
public class ContactServlet extends HttpServlet{
	
	public ContactServlet() {
System.out.println("servlet created");
}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String number=req.getParameter("number");
		String comment=req.getParameter("comment");
		
		ContactDTO dto=new ContactDTO(name, email, number, comment);
		req.setAttribute("dto", dto);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("ContactSuccess.jsp");
		dispatcher.forward(req, resp);
		
	}
	
}
