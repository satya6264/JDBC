package com.vidvaan.vms.dao;

import com.vidvaan.vms.model.Student;

public interface StudentDAO {

	void insert(Student student);

	void update(Student student);

	void delete(int sid);

}
