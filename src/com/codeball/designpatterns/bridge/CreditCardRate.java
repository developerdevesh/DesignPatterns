package com.codeball.designpatterns.bridge;

public class CreditCardRate implements Rate {

	@Override
	public void applyRate() {
		System.out.println("CREDIT");

	}

}
