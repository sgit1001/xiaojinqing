package com.example.demo.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="man")
public class Man implements Serializable {
	//主键
	@Id	
	//自增
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="manId")
    private Integer manId;
	@Column(name="manName")
    private String manName;
	@Column(name="manSex")
    private String manSex;
	@Column(name="manAge")
    private Integer manAge;
	@Column(name="womId")
    private Integer womId;
             
    public Integer getManId() {
        return manId;
    }

    public void setManId(Integer manId) {
        this.manId = manId;
    }

    public String getManName() {
        return manName;
    }

    public void setManName(String manName) {
        this.manName = manName == null ? null : manName.trim();
    }

    public String getManSex() {
        return manSex;
    }

    public void setManSex(String manSex) {
        this.manSex = manSex == null ? null : manSex.trim();
    }

    public Integer getManAge() {
        return manAge;
    }

    public void setManAge(Integer manAge) {
        this.manAge = manAge;
    }

    public Integer getWomId() {
        return womId;
    }

    public void setWomId(Integer womId) {
        this.womId = womId;
    }
}