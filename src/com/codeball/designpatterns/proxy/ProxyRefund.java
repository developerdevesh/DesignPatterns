package com.codeball.designpatterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyRefund implements Refund {

	private Refund refund=new RefundTransaction();
	
	private static List<String> restrictedForRefund=new ArrayList<>();
	
	static {
		restrictedForRefund.add("Chargeback");
		restrictedForRefund.add("Emi");
	}
	
	@Override
	public void refundTransaction(String transactionType) throws Exception {
		if(!restrictedForRefund.contains(transactionType)) {
		   refund.refundTransaction(transactionType);
		}else {
			throw new Exception("Refund not supported for transaction type: "+transactionType);
		}
	}
	
	
}
