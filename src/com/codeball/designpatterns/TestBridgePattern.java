package com.codeball.designpatterns;

import com.codeball.designpatterns.bridge.CreditCardRate;
import com.codeball.designpatterns.bridge.DebitCardRate;
import com.codeball.designpatterns.bridge.EmiTransaction;
import com.codeball.designpatterns.bridge.SaleTransaction;

public class TestBridgePattern {

	public static void main(String[] args) {
		
		SaleTransaction saleTransaction = new SaleTransaction(new DebitCardRate());
		saleTransaction.appyRates();

		EmiTransaction emiTransaction = new EmiTransaction(new CreditCardRate());
		emiTransaction.appyRates();
	}

}
