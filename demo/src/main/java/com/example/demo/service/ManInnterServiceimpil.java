package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ManInnter;
import com.example.demo.po.Man;

@Service
public class ManInnterServiceimpil implements ManInnterService {
	@Autowired
	private ManInnter man;

	@Override
	@Cacheable(value="myman")
	public Man findMan() {
		// TODO Auto-generated method stub
		System.out.println("如果缓存成功");
		Optional<Man> findById = man.findById(1);
		return findById.get();
	}

}
