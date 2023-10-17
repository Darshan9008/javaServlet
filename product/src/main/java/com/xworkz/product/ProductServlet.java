package com.xworkz.product;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.ProductDTO;

@WebServlet(urlPatterns = "/virat", loadOnStartup = 1)
public class ProductServlet extends HttpServlet {
	
	private ProductDTO productDTO;

	public ProductServlet() {
		System.out.println("created product servlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String type=req.getParameter("type");
		String price=req.getParameter("Price");
		String brand=req.getParameter("brand");
		String quantity=req.getParameter("quantity");
		String desc=req.getParameter("desc");
		
		ProductDTO productDTO=new ProductDTO(name, type, price, brand, quantity, desc);

		if(!price.isEmpty()) {
		
		Integer price1=Integer.parseInt(price);
		
		Integer quantity1=Integer.parseInt(quantity);
		  
		Integer total = price1*quantity1;
		System.out.println(total);
		req.setAttribute("t", total);
		 
		req.setAttribute("darshan", productDTO);
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("ProductSuccess.jsp");
		dispatcher.forward(req, resp);
		}
		else {
			req.setAttribute("error", "price is required");
			RequestDispatcher dispatcher1=req.getRequestDispatcher("Product.jsp");
			dispatcher1.forward(req, resp);
		}
		
		
		
		
		
		
	}

}
