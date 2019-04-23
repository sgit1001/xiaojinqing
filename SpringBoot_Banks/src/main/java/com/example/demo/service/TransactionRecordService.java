package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.Dates;
import com.example.demo.pojo.TransactionRecord;


public interface TransactionRecordService {
	// 转出入记录
	int pass(TransactionRecord record);

	// 查询所有记录
	List<TransactionRecord> findAll(Dates dates);
}
