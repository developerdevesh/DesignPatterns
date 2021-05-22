package com.codeball.designpatterns.di;

public class MessageSendingApplication implements ProcessMessaage {

	private MessageService service;

	public MessageSendingApplication(MessageService service) {
		this.service = service;
	}

	@Override
	public void processMsg(String msg, String recipient) {
		service.sendMessage(msg, recipient);

	}

}
