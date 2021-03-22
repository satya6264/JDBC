package com.vidvaan.ems.test;

import com.vidvaan.ems.model.Employee;
import com.vidvaan.ems.service.EmployeeService;
import com.vidvaan.ems.service.EmployeeServiceImpl;

public class EmployeeSelectById {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee employee = employeeService.findById(105);
		System.out.println(employee);
	}

}
