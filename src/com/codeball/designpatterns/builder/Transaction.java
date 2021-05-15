package com.codeball.designpatterns.builder;

/**
 * Get Transaction instance using builder pattern
 * 
 * @author devesh.singh
 *
 */
public class Transaction {

	private Long amount;
	private Long bankCharges;

	private boolean isRefund;
	private boolean isChargeback;

	public Long getAmount() {
		return amount;
	}

	public Long getBankCharges() {
		return bankCharges;
	}

	public boolean isRefund() {
		return isRefund;
	}

	public boolean isChargeback() {
		return isChargeback;
	}

	private Transaction(TransactionBuilder builder) {
		this.amount = builder.amount;
		this.bankCharges = builder.bankCharges;
		this.isRefund = builder.isRefund;
		this.isChargeback = builder.isChargeback;
	}

	public static class TransactionBuilder {

		private Long amount;
		private Long bankCharges;

		private boolean isRefund;
		private boolean isChargeback;

		public TransactionBuilder(Long amount, Long bankCharges) {
			this.amount = amount;
			this.bankCharges = bankCharges;
		}

		public TransactionBuilder setAmount(Long amount) {
			this.amount = amount;

			return this;
		}

		public TransactionBuilder setBankCharges(Long bankCharges) {
			this.bankCharges = bankCharges;

			return this;
		}

		public TransactionBuilder setRefund(boolean refund) {
			this.isRefund = refund;

			return this;
		}

		public TransactionBuilder setChargeback(boolean chargeback) {
			this.isChargeback = chargeback;

			return this;
		}

		public Transaction build() {
			return new Transaction(this);
		}

	}

}
