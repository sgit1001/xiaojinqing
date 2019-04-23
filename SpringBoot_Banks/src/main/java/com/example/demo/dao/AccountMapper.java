package com.example.demo.dao;

import com.example.demo.pojo.Account;
import com.example.demo.pojo.AccountExample;
import java.util.List;

import org.springframework.data.repository.query.Param;

public interface AccountMapper {
    int countByExample(AccountExample example);

    int deleteByExample(AccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    List<Account> selectByExample(AccountExample example);

    Account selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
    //查询卡号返回id
    Integer selectcardno(String cardno);
    //通过卡号查询密码
    String selectpwd (String cardno);
    //查询卡号状态
    Integer selectstatus(String cardno);
}