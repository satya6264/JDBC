package com.vidvaan.vms.test;

import com.vidvaan.vms.service.StudentService;
import com.vidvaan.vms.service.StudentServiceImpl;

public class StudentDeleteTest {
	public static void main(String[] args) {
		StudentService studentService = new StudentServiceImpl();
		studentService.delete(101);
		System.out.println("Success");
	}

}
