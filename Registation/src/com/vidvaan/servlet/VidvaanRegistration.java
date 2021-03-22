package com.vidvaan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javafx.scene.image.Image;

public class VidvaanRegistration extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String first = req.getParameter("first");
		String last = req.getParameter("last");
		String course = req.getParameter("course");
		String mobile = req.getParameter("mobile");
		String location = req.getParameter("location");
		String img = req.getParameter("imge");
		out.println("Name : "+first+" "+last+"<br/>");
		out.println("Course : "+course+"<br>");
		out.println("Mobile : "+mobile+"<br>");
		out.println("Location : "+location+"<br>");
		out.print(img);
	}
	
	

}
