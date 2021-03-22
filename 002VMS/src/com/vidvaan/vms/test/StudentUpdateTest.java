package com.vidvaan.vms.test;

import com.vidvaan.vms.model.Student;
import com.vidvaan.vms.service.StudentService;
import com.vidvaan.vms.service.StudentServiceImpl;

public class StudentUpdateTest {
	public static void main(String[] args) {
		StudentService studentService = new StudentServiceImpl();
		Student student = new Student(102, "Ramana", 15000);
		studentService.update(student);
		System.out.println("Success");
	}

}
