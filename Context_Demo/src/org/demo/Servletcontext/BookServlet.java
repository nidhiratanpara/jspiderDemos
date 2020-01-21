package org.demo.Servletcontext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/bp")
public class BookServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
       
		ServletContext ctx=getServletContext();
		String offmsg=ctx.getInitParameter("ofm");
		String offper=ctx.getInitParameter("off");
		Product pd=(Product) ctx.getAttribute("prd");
		PrintWriter out=resp.getWriter();
		out.println("<html> <body bgcolor='yellow'>"+"<h1>Book Product Details</h1> <p>"+" "+offmsg+" "+offper+" %off "+"<br> <a href=\"Product.html\">Back</a>"+"</body></html>");
		out.flush();
		out.close();
	}

}
