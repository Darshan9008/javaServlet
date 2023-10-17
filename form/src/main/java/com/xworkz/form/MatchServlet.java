package com.xworkz.form;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/virat", loadOnStartup = 1)
public class MatchServlet extends HttpServlet {

	public MatchServlet() {
		System.out.println("match servlet created");
	}

	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String tname = req.getParameter("tname");
		String country = req.getParameter("country");
		String date = req.getParameter("date");
		String teamOne = req.getParameter("teamOne");
		String teamTwo = req.getParameter("teamTwo");
		String captainOne = req.getParameter("captainOne");
		String captainTwo = req.getParameter("captainTwo");
		String umpire = req.getParameter("umpire");
		String stadium = req.getParameter("stadium");
		String thirdUmpire = req.getParameter("thirdUmpire");
		String capacity = req.getParameter("capacity");
		
		MatchDTO matchDTO=new MatchDTO(tname, country, date, teamOne, teamTwo, captainOne, captainTwo, umpire, stadium, thirdUmpire, capacity);
		
		
		req.setAttribute("dto", matchDTO);

		RequestDispatcher dispatcher=req.getRequestDispatcher("MatchSuccess.jsp");
		dispatcher.forward(req, resp);
		
	}

}
