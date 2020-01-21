package org.demo.Servletcontext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/cp")
public class ClothServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
      
		ServletContext ctx=getServletContext();
		String offmsg=ctx.getInitParameter("ofm");
		String offper=ctx.getInitParameter("off");
		PrintWriter out=resp.getWriter();
		out.println("<html> <body bgcolor='orange'>"+"<h1>cloth pruduct details </h1><p>"+" "+offmsg+" "+offper+"%off"+"<br> < a href=\"product.html\">Back </a>"+"</body></html>");
		out.flush();
		out.close();
	}
}