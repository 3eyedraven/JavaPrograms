package com.cg.banking.beans;

public class Transaction {
	private int transcationId;
	private float amount;
	private String transactionType;
	public Transaction() {}
	public Transaction(float amount, String transactionType) {
		super();
		this.amount = amount;
		this.transactionType = transactionType;
	}
	public Transaction(int transcationId, float amount, String transactionType) {
		super();
		this.transcationId = transcationId;
		this.amount = amount;
		this.transactionType = transactionType;
	}
	public int getTranscationId() {
		return transcationId;
	}
	public void setTranscationId(int transcationId) {
		this.transcationId = transcationId;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	

}
