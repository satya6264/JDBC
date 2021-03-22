package com.vidvaan.test;

import java.util.List;

import com.vidvaan.studentDAOIMPL.StudentDaoImpl;
import com.vidvaan.studentmodel.Student;

public class FindAll {
	
	public static void main(String[] args) {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		List<Student> students = studentDaoImpl.findAll();
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
