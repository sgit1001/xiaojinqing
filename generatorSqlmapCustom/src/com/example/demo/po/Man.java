package com.example.demo.po;

public class Man {
    private Integer manId;

    private String manName;

    private String manSex;

    private Integer manAge;

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