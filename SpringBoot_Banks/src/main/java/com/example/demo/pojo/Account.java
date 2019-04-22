package com.example.demo.pojo;

public class Account {
	private int id;
	
    private String cardno;

    private String password;

    private Double balance;

    private Integer status;

	public Account() {
		super();
	}

	public Account(int id, String cardno, String password, Double balance, Integer status) {
		super();
		this.id = id;
		this.cardno = cardno;
		this.password = password;
		this.balance = balance;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}