package com.codeball.designpatterns;

import com.codeball.designpatterns.facade.FacadeRefund;
import com.codeball.designpatterns.facade.TransactionType;

public class TestFacadePattern {

	public static void main(String[] args) {
		FacadeRefund refund = new FacadeRefund();

		refund.refundTransaction(TransactionType.SALE);
		refund.refundTransaction(TransactionType.EMI);

	}

}
