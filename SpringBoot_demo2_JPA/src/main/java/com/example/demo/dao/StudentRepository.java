package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.pojo.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
	
}
