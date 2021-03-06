package com.example.demo.pojo;

public class TransactionRecord {

	private int id;
	
    private String cardno;

    private String transactionDate;

    private Double expense;

    private Double income;

    private Double balance;

    private String transactionType;

    private String remark;


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
        this.cardno = cardno == null ? null : cardno.trim();
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate == null ? null : transactionDate.trim();
    }

    public Double getExpense() {
        return expense;
    }

    public void setExpense(Double expense) {
        this.expense = expense;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType == null ? null : transactionType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	@Override
	public String toString() {
		return "TransactionRecord [id=" + id + ", cardno=" + cardno + ", transactionDate=" + transactionDate
				+ ", expense=" + expense + ", income=" + income + ", balance=" + balance + ", transactionType="
				+ transactionType + ", remark=" + remark + "]";
	}
    
}