package com.vidvaan.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	    out.println("<h1><font color=blue>welcome to the servlet world</font></h1>");
	    out.println("<font color = red>the local date and time is:</font>"+new GregorianCalendar().getTime());
	    out.close();
	    
	}
	
	

}
