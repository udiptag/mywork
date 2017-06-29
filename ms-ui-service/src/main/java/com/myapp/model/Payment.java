package com.myapp.model;

import java.util.Date;


public class Payment{

	private long trxnid;
	
	private long amount;

	private Date trxnDate;

	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(long amount, Date trxnDate) {
		this.amount = amount;
		this.trxnDate = trxnDate;
	}

	public long getTrxnid() {
		return trxnid;
	}

	public void setTrxnid(long trxnid) {
		this.trxnid = trxnid;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public Date getTrxnDate() {
		return trxnDate;
	}

	public void setTrxnDate(Date trxnDate) {
		this.trxnDate = trxnDate;
	}
	
	
	
}
