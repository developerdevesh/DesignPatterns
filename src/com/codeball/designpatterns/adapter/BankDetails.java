package com.codeball.designpatterns.adapter;

/**
 * Bank details
 * 
 * @author devesh.singh
 *
 */
public class BankDetails {

	private String personName;
	private String accountNo;
	private String ifscCode;

	public String getPersonName() {
		return personName;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
}
