package com.codeball.designpatterns;

import com.codeball.designpatterns.adapter.LoanAdapter;
import com.codeball.designpatterns.factory.Sale;
import com.codeball.designpatterns.factory.Transaction;
import com.codeball.designpatterns.factory.TransactionFactory;

public class TestAdapterPatternMain {

	public static void main(String[] args) {

		LoanAdapter loanAdapter = new LoanAdapter();
		loanAdapter.giveBankDetails();
		loanAdapter.getLoan();

	}

}
