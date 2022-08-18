package com.cg.banking.beans;

public class Transaction {
	private long accountNo;
	private int transcationId;
	private float amount;
	public Transaction() {}
	public Transaction(long accountNo, float amount) {
		super();
		this.accountNo = accountNo;
		this.amount = amount;
	}
	public Transaction(long accountNo, int transcationId, float amount) {
		super();
		this.accountNo = accountNo;
		this.transcationId = transcationId;
		this.amount = amount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (accountNo ^ (accountNo >>> 32));
		result = prime * result + Float.floatToIntBits(amount);
		result = prime * result + transcationId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (accountNo != other.accountNo)
			return false;
		if (Float.floatToIntBits(amount) != Float.floatToIntBits(other.amount))
			return false;
		if (transcationId != other.transcationId)
			return false;
		return true;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
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
	@Override
	public String toString() {
		return "Transaction [accountNo=" + accountNo + ", transcationId=" + transcationId + ", amount=" + amount + "]";
	}
	
}

