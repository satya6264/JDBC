package com.vidvaan.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidvaan.ems.model.Employee;
import com.vidvaan.ems.service.EmployeeService;
import com.vidvaan.ems.service.EmployeeServiceImpl;

/**
 * Servlet implementation class FindAllController
 */
public class FindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FindAllController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<h1>All Employees Info</h1><hr>");

		EmployeeService employeeService = new EmployeeServiceImpl();
		List<Employee> employees = employeeService.findAll();
		out.println("<table border='1px'>");
		out.println("<tr><th>Eid</th><th>Ename</th><th>Esal</th></tr>");
		for (Employee employee : employees) {
			out.println("<tr>");
			out.println("<td>" + employee.getEid() + "</td>");
			out.println("<td>" + employee.getEname() + "</td>");
			out.println("<td>" + employee.getEsal() + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");
	}

}
