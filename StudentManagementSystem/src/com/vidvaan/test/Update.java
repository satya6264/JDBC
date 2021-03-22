package com.vidvaan.test;

import com.vidvaan.studentDAOIMPL.StudentDaoImpl;
import com.vidvaan.studentmodel.Student;

public class Update {
	public static void main(String[] args) {
		StudentDaoImpl studentDaoImpl=new StudentDaoImpl();
		Student student=new Student(101,"Ashraf",30000.00);
		studentDaoImpl.update(student);
		System.out.println("Scucess");
		
	}

}
