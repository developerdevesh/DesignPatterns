package com.codeball.designpatterns;

import com.codeball.designpatterns.factory.Sale;
import com.codeball.designpatterns.factory.Transaction;
import com.codeball.designpatterns.factory.TransactionFactory;

public class TestFactoryPatternMain {

	public static void main(String[] args) {

		Transaction transaction = TransactionFactory.getTransaction("SALE", 100L, 3L);

		System.out.println("Object type Sale = :" + (transaction instanceof Sale));

	}

}
