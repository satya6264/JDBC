package com.vidvaan.ems.test;

import java.util.List;

import com.vidvaan.ems.model.Employee;
import com.vidvaan.ems.service.EmployeeService;
import com.vidvaan.ems.service.EmployeeServiceImpl;

public class EmployeeSelectAll {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImpl();
		List<Employee> employees = employeeService.findAll();
		for (Employee employee : employees) {
			System.out.println(employee);
			
		}
	}

}
