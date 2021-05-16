package com.codeball.designpatterns;

import com.codeball.designpatterns.dacorator.BankCharges;
import com.codeball.designpatterns.dacorator.BasicCharges;
import com.codeball.designpatterns.dacorator.Charges;
import com.codeball.designpatterns.dacorator.DebitCardCharges;

public class TestDecoratorPattern {

	public static void main(String[] args) {

		Charges bankCharges = new BankCharges(new BasicCharges());
		bankCharges.applyCharges();
		System.out.println();
		Charges debitCharges = new DebitCardCharges(new BankCharges(new BasicCharges()));
		debitCharges.applyCharges();
	}

}
