package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService stu;
	
	@RequestMapping("getStudent")
	public Student find() {
		System.out.println(stu.select(1));
		return stu.select(1);
	}
	
}
