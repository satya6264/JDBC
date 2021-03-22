package com.vidvaan.ems.test;

import com.vidvaan.ems.model.Employee;
import com.vidvaan.ems.service.EmployeeService;
import com.vidvaan.ems.service.EmployeeServiceImpl;

public class InsertTest {
	public static void main(String[] args) {
		EmployeeService employee2Service = new EmployeeServiceImpl();
		Employee employee2 = new Employee(106, "Ramana", 25000.00);
		employee2Service.insert(employee2);
		System.out.println("Success !");
	}

}
