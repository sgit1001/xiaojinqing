package com.example.demo.pojo;
public class Dates {
	private String date1;
	private String date2;
	private String cardno;
	private Integer newPwd;

	public Dates() {
		super();
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public Integer getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(Integer newPwd) {
		this.newPwd = newPwd;
	}

	public Dates(String date1, String date2, String cardno, Integer newPwd) {
		super();
		this.date1 = date1;
		this.date2 = date2;
		this.cardno = cardno;
		this.newPwd = newPwd;
	}


	public Dates(String date1, String date2) {
		super();
		this.date1 = date1;
		this.date2 = date2;
	}

	public Dates(String date1, String date2, String cardno) {
		super();
		this.date1 = date1;
		this.date2 = date2;
		this.cardno = cardno;
	}

	public String getDate1() {
		return date1;
	}

	public void setDate1(String date1) {
		this.date1 = date1;
	}

	public String getDate2() {
		return date2;
	}

	public void setDate2(String date2) {
		this.date2 = date2;
	}

}
