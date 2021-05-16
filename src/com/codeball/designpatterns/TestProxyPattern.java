package com.codeball.designpatterns;

import com.codeball.designpatterns.proxy.ProxyRefund;
import com.codeball.designpatterns.proxy.Refund;

public class TestProxyPattern {

	public static void main(String[] args) {
		try {
		Refund refund=new ProxyRefund();
		refund.refundTransaction("Sale");
		refund.refundTransaction("Chargeback");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
