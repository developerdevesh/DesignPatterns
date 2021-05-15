package com.codeball.designpatterns.factory;

/**
 * Responsible to create transactions on the basis of transaction type
 * 
 * @author devesh.singh
 *
 */
public class TransactionFactory {

	public static Transaction getTransaction(String type, Long amount, Long bankCharges) {

		if (type.equalsIgnoreCase("EMI")) {
			return new Emi(amount, bankCharges);
		} else if (type.equalsIgnoreCase("SALE")) {
			return new Sale(amount, bankCharges);
		}

		return null;
	}

}
