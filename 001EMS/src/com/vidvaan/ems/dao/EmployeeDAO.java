package com.vidvaan.ems.dao;



import java.util.List;

import com.vidvaan.ems.model.Employee;

public interface EmployeeDAO {
	void insert(Employee enployee);

	void update(Employee employee);

	void delete(int eid);
	
	List<Employee> findAll();
	
	Employee findById(int eid);
	
	List<Employee> searchByNameLike(String flag);
}
