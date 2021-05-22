package com.codeball.designpatterns.di;

public class EmailServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String receipient) {

		System.out.println("Email is sent to " + receipient + " with Message=" + msg);
	}

}