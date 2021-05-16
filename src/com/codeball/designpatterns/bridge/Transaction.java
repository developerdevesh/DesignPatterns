package com.codeball.designpatterns.bridge;

public abstract class Transaction {

	protected Rate rate;

	public Transaction(Rate rate) {
		this.rate=rate;
	}
	
	public abstract void appyRates();
	
}
