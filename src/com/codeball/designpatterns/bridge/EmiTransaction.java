package com.codeball.designpatterns.bridge;

/**
 * EmiTransaction
 * 
 * @author devesh.singh
 *
 */
public class EmiTransaction extends Transaction{

	public EmiTransaction(Rate rate) {
		super(rate);
	}

	@Override
	public void appyRates() {
		System.out.print("EMI transaction rates applied:");
		rate.applyRate();
	}

}
