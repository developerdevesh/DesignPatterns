package com.codeball.designpatterns.di;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public ProcessMessaage getProcessMessage() {
		return new MessageSendingApplication(new EmailServiceImpl());
	}

}