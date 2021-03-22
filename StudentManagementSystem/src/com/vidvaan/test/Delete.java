package com.vidvaan.test;

import com.vidvaan.studentDAOIMPL.StudentDaoImpl;

public class Delete {
	
	public static void main(String[] args) {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		studentDaoImpl.delete(1001);
		System.out.println("Success...");
	}

}
