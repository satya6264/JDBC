package com.vidvaan.test;

import java.util.List;

import com.vidvaan.studentDAOIMPL.StudentDaoImpl;
import com.vidvaan.studentmodel.Student;

public class StudentSearchByNameLikeTest {
	
	public static void main(String[] args) {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		List<Student> students = studentDaoImpl.searchByNameLike("A");
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
