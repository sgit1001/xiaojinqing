package com.example.demo.mapper;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.po.Man;

public interface ManInnter extends CrudRepository<Man, Integer> {
		
}
