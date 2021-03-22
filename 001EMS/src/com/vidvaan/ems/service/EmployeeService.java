package com.vidvaan.ems.service;

import java.util.List;

import com.vidvaan.ems.model.Employee;

public interface EmployeeService {
	void insert(Employee employee);

	void update(Employee employee);

	void delete(int eid);

	List<Employee> findAll();

	Employee findById(int eid);
	
	List<Employee> searchByNameLike(String flag);
	
}
