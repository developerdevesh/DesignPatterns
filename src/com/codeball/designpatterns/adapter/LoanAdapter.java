package com.codeball.designpatterns.adapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LoanAdapter extends BankDetails implements Loan {

	@Override
	public void giveBankDetails() {

		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Input account holder name:");
			String cardHolderName = bufferedReader.readLine();
			System.out.print("\n");

			System.out.print("Input account number:");
			String accountNo = bufferedReader.readLine();
			System.out.print("\n");

			System.out.print("Input IFSC Code:");
			String ifscCode = bufferedReader.readLine();
			System.out.print("\n");

			setPersonName(cardHolderName);
			setAccountNo(accountNo);
			setIfscCode(ifscCode);

		} catch (Exception e) {
			System.out.println("Exception occurred in providing bank details,");
		}
	}

	@Override
	public void getLoan() {

		if (getAccountNo() != null && getIfscCode() != null) {
			System.out.println("Loan is approved and will be creadited in account no :" + getAccountNo());
		}

	}

}
