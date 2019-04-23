package com.example.demo.dao;

import com.example.demo.pojo.Account;
import com.example.demo.pojo.AccountExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AccountMapper {
	
    int countByExample(AccountExample example);

    int deleteByExample(AccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    List<Account> selectByExample(AccountExample example);

    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
    
    Integer selectcardno(String cardno);
    
    String selectpwd (String cardno);
    
    Integer selectstatus(String cardno);
    
    Account selectMoney(String cardno);
}