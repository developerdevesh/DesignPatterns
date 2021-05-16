package com.codeball.designpatterns.bridge;

/**
 * SaleTransaction
 * 
 * @author devesh.singh
 *
 */
public class SaleTransaction extends Transaction {

	public SaleTransaction(Rate rate) {
		super(rate);
	}

	@Override
	public void appyRates() {
		System.out.print("Sale transaction rates applied:");
		rate.applyRate();
	}

}
