package com.codeball.designpatterns.dacorator;

public class DebitCardCharges extends ChargeDecorator {

	public DebitCardCharges(Charges charges) {
		super(charges);
	}

	@Override
	public void applyCharges() {
		super.applyCharges();
		System.out.print("Apply debit card charges.");
	}
	
}
