package com.vidvaan.studentDAO;

import java.util.List;

import com.vidvaan.studentmodel.Student;

public interface StudentDAO {

	void insert(Student student);

	void update(Student student);

	void delete(int sid);

	Student findById(int eid);

	List<Student> findAll();

	List<Student> searchByNameLike(String flag);

}
