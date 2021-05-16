package com.codeball.designpatterns.proxy;

/**
 * RefundTransaction
 * 
 * @author devesh.singh
 *
 */
public class RefundTransaction implements Refund {

	@Override
	public void refundTransaction(String transactionType) throws Exception {

		System.out.println("Transaction "+transactionType+" refunded successfully!!");
		
	}
	
	
}
