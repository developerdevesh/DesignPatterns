package com.codeball.designpatterns;

import com.codeball.designpatterns.builder.Transaction;
import com.codeball.designpatterns.factory.Sale;


/**
 * Create Instance using builder design pattern
 * 
 * @author devesh.singh
 *
 */
public class TestBuilderPatternMain {

	public static void main(String[] args) {

		Transaction transaction = new Transaction.TransactionBuilder(200L, 10L)
				.setRefund(true)
				.setChargeback(false).build();

		System.out.println("Is refund transaction :" + transaction.isRefund());
		System.out.println("Is chargeback transaction :" + transaction.isChargeback());

	}

}
