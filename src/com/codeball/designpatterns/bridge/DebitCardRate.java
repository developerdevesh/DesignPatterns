package com.codeball.designpatterns.bridge;

public class DebitCardRate implements Rate {

	@Override
	public void applyRate() {
		System.out.println("DEBIT");

	}

}
