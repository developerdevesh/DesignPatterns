package com.codeball.designpatterns.facade;

/**
 * RefundEmi
 * 
 * @author devesh.singh
 *
 */
public class RefundEmi implements Refund {

	@Override
	public void refundTransaction() {

		System.out.println("EMI transaction refunded");
		
	}
	
	
}
