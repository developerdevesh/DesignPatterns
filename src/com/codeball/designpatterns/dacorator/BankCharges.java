package com.codeball.designpatterns.dacorator;

public class BankCharges extends ChargeDecorator {

	public BankCharges(Charges charges) {
		super(charges);
	}

	@Override
	public void applyCharges() {
		super.applyCharges();
		System.out.print("Apply bank charges.");
	}
	
}
