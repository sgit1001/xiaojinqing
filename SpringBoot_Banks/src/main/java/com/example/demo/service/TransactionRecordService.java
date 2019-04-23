package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.Dates;
import com.example.demo.pojo.TransactionRecord;

public interface TransactionRecordService {

	// 转出入记录
	int pass(TransactionRecord record);

	// 查询所有记录
	List<TransactionRecord> findAll(Dates dates);

	// 查询余额
	TransactionRecord findMoney(int id);

	// 查询卡号返回id
	Integer selectcardno(String cardno);

	// 通过卡号查询密码
	String selectpwd(String cardno);

	// 查询卡号状态
	Integer selectstatus(String cardno);
}
