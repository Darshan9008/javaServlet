package com.xworkz.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/yuvraj", loadOnStartup = 1)
public class LoginServlet extends HttpServlet {

	public LoginServlet() {
		System.out.println("created login servlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id=req.getParameter("id");
		String password=req.getParameter("password");
		
		if(id.equals("admin") && password.equals("secret")) {
			req.setAttribute("id", id);
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("LoginSuccess.jsp");
				dispatcher.forward(req, resp);
			 
		}else {
			req.setAttribute("incorrect", "incorrect user id or password");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, resp);
			
		}
	
}
}