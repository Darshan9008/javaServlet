package com.xworkz.policeStation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/virat", loadOnStartup = 1)
public class PoliceStationServlet extends HttpServlet {

	public PoliceStationServlet() {
		System.out.println("invoking const in police station");

	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
		String stationName=req.getParameter("sname");
		String headConstableName=req.getParameter("hname");
		String location=req.getParameter("location");
		String inspectorName=req.getParameter("iname");
		String siName=req.getParameter("siname");
		String noOfCells=req.getParameter("cell");
		String noOfCases=req.getParameter("case");
		String painted=req.getParameter("paint");
		
		
		System.out.println("stationName:"+stationName);
		System.out.println("headConstableName:"+headConstableName);
		System.out.println("location:"+location);
		System.out.println("inspectorName:"+inspectorName);
		System.out.println("SI name:"+siName);
		System.out.println("noOfCells:"+noOfCells);
		System.out.println("noOfCases:"+noOfCases);
		System.out.println("painted:"+painted);

		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		
		
		
		writer.print("<h1>Information saved successfully.....</h1>");
		writer.print("<h3> Head Constable Name:"+headConstableName+"</h3>");
		writer.print("<h3> Location:  "+location+"</h3>");
		writer.print("<h3> Inspector Name:"+inspectorName+"</h3>");

		writer.print("<h3> SI Name:"+siName+"</h3>");

		writer.print("<h3> No Of Cells: "+noOfCells+"</h3>");
		writer.print("<h3> No Of Cases:"+noOfCases+"</h3>");
		writer.print("<h3> Is Station Painted :"+painted+"</h3>");


		


		
	}
	

}
