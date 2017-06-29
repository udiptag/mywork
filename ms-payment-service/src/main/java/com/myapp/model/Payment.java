package com.myapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Payment{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long trxnid;
	
	private long amount;
	
	@Temporal(TemporalType.DATE)
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
