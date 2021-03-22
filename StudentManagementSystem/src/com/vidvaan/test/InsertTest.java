package com.vidvaan.test;

import com.vidvaan.studentDAOIMPL.StudentDaoImpl;
import com.vidvaan.studentmodel.Student;

public class InsertTest {
	public static void main(String[] args) {
		StudentDaoImpl studentDaoImpl=new StudentDaoImpl();
		Student student = new Student(106, "raveen", 80000.00);
		studentDaoImpl.insert(student);
		System.out.println("Success...");
		
	}

}
