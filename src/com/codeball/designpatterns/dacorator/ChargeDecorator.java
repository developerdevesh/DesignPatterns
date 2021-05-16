package com.codeball.designpatterns.dacorator;

public class ChargeDecorator implements Charges {

	protected Charges charges;

	public ChargeDecorator(Charges charges) {
		this.charges = charges;
	}

	@Override
	public void applyCharges() {
		charges.applyCharges();
	}

}
