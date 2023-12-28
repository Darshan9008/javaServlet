package com.xworkz.bakery;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/virat" ,loadOnStartup = 1)
public class BakeryServlet extends HttpServlet {

	public BakeryServlet() {
		System.out.println("bakeryservlet is created");
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String item=req.getParameter("item");
		String price=req.getParameter("price");
		String quantity=req.getParameter("quantity");
		String discount=req.getParameter("discount");
		String gst=req.getParameter("gst");
		
		
		req.setAttribute("item", item);
		req.setAttribute("price", price);
		req.setAttribute("quantity", quantity);
		req.setAttribute("discount", discount);
		req.setAttribute("gst", gst);
		
		
		if(!price.isEmpty() && !quantity.isEmpty() && !gst.isEmpty() && !item.isEmpty() && !discount.isEmpty()) {
			
			Integer price1=Integer.parseInt(price);
			Integer discount1=Integer.parseInt(discount);
			Integer quantity1=Integer.parseInt(quantity);
			Integer gst1=Integer.parseInt(gst);
			int total1=price1*(100-discount1)/100;
			int total2=total1*quantity1;
			int total3= total2+gst1;
			
			
			req.setAttribute("total3", total3);
			

			req.setAttribute("item", item);
			req.setAttribute("price", price);
			req.setAttribute("quantity", quantity);
			req.setAttribute("discount", discount);
			req.setAttribute("gst", gst);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("BakerySuccess.jsp");
		dispatcher.forward(req, resp);
		}else {
			req.setAttribute("error", "price is required");
			RequestDispatcher dispatcher1=req.getRequestDispatcher("Bakery.jsp");
			dispatcher1.forward(req, resp);

		}
		
		
		
		
	}
	

}
