package com.vidvaan.ems.service;

import java.util.List;

import com.vidvaan.ems.dao.EmployeeDAO;
import com.vidvaan.ems.dao.EmployeeDAOImpl;
import com.vidvaan.ems.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	
	@Override
	public void insert(Employee employee) {
		employeeDAO.insert(employee);
	}

	@Override
	public void update(Employee employee) {
		employeeDAO.update(employee);
		
	}

	@Override
	public void delete(int eid) {
		employeeDAO.delete(eid);
		
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> employees= employeeDAO.findAll();
		return employees;
	}

	@Override
	public Employee findById(int eid) {
		return employeeDAO.findById(eid);
	}

	@Override
	public List<Employee> searchByNameLike(String flag) {
		return employeeDAO.searchByNameLike(flag);
	}

}
