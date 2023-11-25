package com.xworkz.mock;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.mock.dto.MockDTO;


@WebServlet(urlPatterns = "/virat", loadOnStartup = 5)
public class MockServlet extends HttpServlet {
	public MockServlet() {
System.out.println("servlet created");	

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sino=req.getParameter("sino");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String mname=req.getParameter("mname");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		String phno=req.getParameter("phno");
		String area=req.getParameter("area");
		String district=req.getParameter("district");
		String state=req.getParameter("state");
		String pincode=req.getParameter("pincode");
		
		MockDTO dto=new MockDTO(sino, fname, lname, mname, email, gender, phno, area, district, state, pincode);
		req.setAttribute("mock", dto);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("MockSuccess.jsp");
		dispatcher.forward(req, resp);
		
	}
	
	
	
	
	
	
	
	

}
