package com.codeball.designpatterns.facade;

/**
 * Refund transactions on the basis of transaction type
 * 
 * @author devesh.singh
 *
 */
public class FacadeRefund {

	private Refund refundSale = new RefundSale();
	private Refund refundEmi = new RefundEmi();

	public void refundTransaction(TransactionType transactionType) {

		switch (transactionType) {
		case SALE:
			refundSale.refundTransaction();
			break;
		case EMI:
			refundEmi.refundTransaction();
			break;
		}
	}

}
