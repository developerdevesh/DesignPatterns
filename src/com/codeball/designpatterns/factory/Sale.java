package com.codeball.designpatterns.factory;


/**
 * Sale Transaction
 * 
 * @author devesh.singh
 *
 */
public class Sale implements Transaction {

	private Long amount;
	private Long bankCharges;

	public Sale(Long amount, Long bankCharges) {
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
