package com.example.demo.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stuId")
	private Integer stuId;
	@Column(name="stuName")
	private String stuName;
	@Column(name="classId")
	private Integer classId;
	@Column(name="stuSex")
	private String stuSex;
	@Column(name="birthday")
	private String birthday;
	@Column(name="cardNo")
	private String cardNo;
	@Column(name="phone")
	private String phone;
	@Column(name="emailAddress")
	private String emailAddress;
	@Column(name="address")
	private String address;
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student() {
		super();
	}
	public Student(Integer stuId, String stuName, Integer classId, String stuSex, String birthday, String cardNo,
			String phone, String emailAddress, String address) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.classId = classId;
		this.stuSex = stuSex;
		this.birthday = birthday;
		this.cardNo = cardNo;
		this.phone = phone;
		this.emailAddress = emailAddress;
		this.address = address;
	}
}
