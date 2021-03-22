package com.vidvaan.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidvaan.ems.model.Employee;
import com.vidvaan.ems.service.EmployeeService;
import com.vidvaan.ems.service.EmployeeServiceImpl;

/**
 * Servlet implementation class InsertController
 */
public class InsertController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String eno = request.getParameter("eno");
		String ename = request.getParameter("ename");
		String esal = request.getParameter("esal");

		Employee employee = new Employee();
		employee.setEid(Integer.parseInt(eno));
		employee.setEname(ename);
		employee.setEsal(Double.parseDouble(esal));

		EmployeeService employeeService = new EmployeeServiceImpl();
		employeeService.insert(employee);

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<h1>Inserted Successfully!</h1>");
	}

}
