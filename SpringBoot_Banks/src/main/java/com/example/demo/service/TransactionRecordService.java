package com.example.demo.service;

import com.example.demo.pojo.TransactionRecord;

public interface TransactionRecordService {
	
	//查询余额
	TransactionRecord findMoney(int id);
	 //查询卡号返回id
    Integer selectcardno(String cardno);
    //通过卡号查询密码
    String selectpwd (String cardno);
    //查询卡号状态
    Integer selectstatus(String cardno);
}
