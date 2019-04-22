package com.example.demo.po;

public class Woman {
    private Integer womId;

    private String womName;

    private String womSex;

    private Integer womAge;

    public Integer getWomId() {
        return womId;
    }

    public void setWomId(Integer womId) {
        this.womId = womId;
    }

    public String getWomName() {
        return womName;
    }

    public void setWomName(String womName) {
        this.womName = womName == null ? null : womName.trim();
    }

    public String getWomSex() {
        return womSex;
    }

    public void setWomSex(String womSex) {
        this.womSex = womSex == null ? null : womSex.trim();
    }

    public Integer getWomAge() {
        return womAge;
    }

    public void setWomAge(Integer womAge) {
        this.womAge = womAge;
    }
}