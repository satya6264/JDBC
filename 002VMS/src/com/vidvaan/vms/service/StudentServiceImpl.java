package com.vidvaan.vms.service;

import com.vidvaan.vms.dao.StudentDAO;
import com.vidvaan.vms.dao.StudentDAOImpl;
import com.vidvaan.vms.model.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDAO studentDAO = new StudentDAOImpl();

	@Override
	public void insert(Student student) { 
		studentDAO.insert(student);
		
	}

	@Override
	public void update(Student student) {
		studentDAO.update(student);
		
	}

	@Override
	public void delete(int sid) {
		studentDAO.delete(sid);
		
	}

}
