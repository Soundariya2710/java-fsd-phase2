package com.simplilearn.fsdphase2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class welcomeservlet extends HttpServlet {
	
	public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws IOException {
		// TODO Auto-generated method stub
		httpServletResponse.setContentType("text/html");

		PrintWriter pw = httpServletResponse.getWriter();

		pw.println("<html><body>");
		pw.println("Welcome To My Servlet!!!");
		pw.println("</body></html>");

		pw.close();
	}

}
