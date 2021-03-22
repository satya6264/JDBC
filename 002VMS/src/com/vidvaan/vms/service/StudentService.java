package com.vidvaan.vms.service;

import com.vidvaan.vms.model.Student;

public interface StudentService {
	
	void insert(Student student);
	
	void update(Student student);
	
	void delete(int sid);

}
