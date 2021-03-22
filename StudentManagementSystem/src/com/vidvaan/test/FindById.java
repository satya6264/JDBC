package com.vidvaan.test;

import com.vidvaan.studentDAOIMPL.StudentDaoImpl;
import com.vidvaan.studentmodel.Student;

public class FindById {
	public static void main(String[] args) {
		StudentDaoImpl studentDaoImpl=new StudentDaoImpl();
		Student student=studentDaoImpl.findById(102);
		System.out.println(student);
		
	}

}
