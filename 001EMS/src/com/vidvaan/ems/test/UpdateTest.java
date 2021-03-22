package com.vidvaan.ems.test;

import com.vidvaan.ems.model.Employee;
import com.vidvaan.ems.service.EmployeeService;
import com.vidvaan.ems.service.EmployeeServiceImpl;

public class UpdateTest {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee employee = new Employee(102, "Harish", 25000.00);
		employeeService.update(employee);
		System.out.println("success !");
	}

}
