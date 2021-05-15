package com.codeball.designpatterns.factory;

/**
 * EMI Transaction
 * 
 * @author devesh.singh
 *
 */
public class Emi implements Transaction {

	private Long amount;
	private Long bankCharges;

	
	public Emi(Long amount, Long bankCharges) {
		super();
		this.amount = amount;
		this.bankCharges = bankCharges;
	}

	@Override
	public Long getAmount() {
		return amount;

	}

	@Override
	public Long getBankCharges() {
		return bankCharges;

	}

}
