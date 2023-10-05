package com.xworkz.farmer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/cricket",loadOnStartup=1)
public class FarmerResource extends HttpServlet {
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name=req.getParameter("name");
		String area=req.getParameter("area");
		String soil=req.getParameter("soil");
		String crop=req.getParameter("crop");
		String fertilizer=req.getParameter("fertilizer");
		String season=req.getParameter("season");
		String investment=req.getParameter("investment");
		String profit=req.getParameter("profit");
		String seed=req.getParameter("seed");
		
		System.out.println("name:"+name);
		System.out.println("area:"+area);
		System.out.println("soil:"+soil);
		System.out.println("crop:"+crop);
		System.out.println("fertilizer:"+fertilizer);
		System.out.println("season:"+season);
		System.out.println("investment:"+investment);
		System.out.println("profit:"+profit);
		System.out.println("seed:"+seed);
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		

		writer.print("farmer name "+name+"owns the area "+area+"of the soil type"+soil+"has grown crops"+crop+"use the fertilizer+fertilizer"+"in the season"+season+"of the investment"+investment+"has taken the profit"+profit+"on the seed"+seed);
		
		
		
		writer.print("</body>");

		writer.print("</html>");
		writer.print("</br>");

		writer.print("Information saved successfully.....");

		
		
		
		
		
		
		
	
	}
	
	
	
	

}
