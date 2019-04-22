package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.pojo.Student;

@Service
public class StudentImpol implements StudentService {
	
	@Autowired
	private StudentRepository stu;
	
	@Override
	@Cacheable(value = "student")
	public Student select(int stuid) {
		return stu.findById(stuid).get();
	}
	
}
