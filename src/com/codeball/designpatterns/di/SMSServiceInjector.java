package com.codeball.designpatterns.di;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public ProcessMessaage getProcessMessage() {
		return new MessageSendingApplication(new SMSServiceImpl());
	}

}