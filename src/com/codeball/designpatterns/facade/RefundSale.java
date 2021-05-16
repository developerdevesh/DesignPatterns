package com.codeball.designpatterns.facade;

/**
 * RefundSale
 * 
 * @author devesh.singh
 *
 */
public class RefundSale implements Refund {

	@Override
	public void refundTransaction() {

		System.out.println("Sale transaction refunded");
		
	}
	
	
}
