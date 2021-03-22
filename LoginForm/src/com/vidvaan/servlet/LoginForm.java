package com.vidvaan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginForm extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 resp.setContentType("text/html");
		 PrintWriter out=resp.getWriter();
		 String name = req.getParameter("user_name");
		 String password = req.getParameter("password");
		 String languages[]=req.getParameterValues("languages");
		 String gender = req.getParameter("gender");
		 String feedback = req.getParameter("feedback");
		 String jobcategory = req.getParameter("jobcategory");
		 
		 out.println(name);
		 out.println(password);
		if(languages != null) {
		 out.println("Languages : ");
		 for (String lang : languages) {
			out.println("/t"+lang+"</br>");
		}
		 
	}
		out.println(gender);
		out.println(feedback);
		out.println(jobcategory);
	
	}

}
