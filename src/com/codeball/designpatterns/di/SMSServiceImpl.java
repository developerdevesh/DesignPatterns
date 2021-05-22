package com.codeball.designpatterns.di;

public class SMSServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String receipient) {

		System.out.println("SMS is sent to " + receipient + " with Message=" + msg);
	}

}