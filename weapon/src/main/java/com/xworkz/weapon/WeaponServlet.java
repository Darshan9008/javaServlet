package com.xworkz.weapon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/virat" ,loadOnStartup = 1)
public class WeaponServlet extends HttpServlet{
	
	
									
	public WeaponServlet() {

	System.out.println("created weapon servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String gname=req.getParameter("gname");
		String made=req.getParameter("made");
		String price=req.getParameter("price");
		String type=req.getParameter("type");
		
		System.out.println("Gun Name"+gname);
		System.out.println("made:"+made);
		System.out.println("price:"+price);
		System.out.println("type:"+type);
		
		
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		
		writer.print("<head>");
		writer.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n"
				+ "");
		writer.print("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n"
				+ "");

		writer.print("</head>");
		writer.print("<body>");
		
		writer.println("<nav class=\"navbar navbar-expand-lg\"  style=\"background-color: hsla(89, 43%, 51%, 0.3);\">\r\n"
				+ "  <div class=\"container-fluid\">\r\n"
				+ "    <a class=\"navbar-brand\" href=\"#\">OUTPUT_PAGE</a>\r\n"
				+ "    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "      <span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "    </button>\r\n"
				+ "    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
				+ "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link active\" aria-current=\"page\" href=\"index.html\"><b>HOME</b></a>\r\n"
				+ "        </li>\r\n"
				+ "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link active\" aria-current=\"page\" href=\"weapon.html\"><b>DETAILS_PAGE</b></a>\r\n"
				+ "        </li>\r\n"
				+ "         <div class=\"container-fluid\">\r\n"
				+ "    <form class=\"d-flex\">\r\n"
				+ "      <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n"
				+ "      <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n"
				+ "    </form>\r\n"
				+ "  </div>\r\n"
				+ "  </div>\r\n"
				+ "  </div>\r\n"
				+ "</nav>");
		
	
		writer.print("<h1>Information saved successfully.....</h1>");

		writer.print("<h3> Name of the Gun:  "+gname+"</h3>");
		writer.print("<h3> Made By:  "+made+"</h3>");
		writer.print("<h3> Price Of the Gun:  "+price+"</h3>");
		writer.print("<h3> Type of the Gun:  "+type+"</h3>");

		writer.print("</html>");
		writer.print("</body>");



		
		
		
	
	
	}
	

}
