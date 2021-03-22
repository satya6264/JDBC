package com.vidvaan.vms.test;

import com.vidvaan.vms.model.Student;
import com.vidvaan.vms.service.StudentService;
import com.vidvaan.vms.service.StudentServiceImpl;

public class InsertTest {
	public static void main(String[] args) {
		
		StudentService studentService= (StudentService) new StudentServiceImpl();
		Student student = new Student(105, "Kishore", 3000);
		studentService.insert(student);
		System.out.println("Success");
		
	}

}
