package com.codeball.designpatterns.dacorator;

public class BasicCharges implements Charges {

	@Override
	public void applyCharges() {
		System.out.print("Apply basic charges.");

	}

}
