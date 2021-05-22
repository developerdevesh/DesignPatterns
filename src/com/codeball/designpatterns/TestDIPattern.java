package com.codeball.designpatterns;

import com.codeball.designpatterns.di.EmailServiceInjector;
import com.codeball.designpatterns.di.MessageServiceInjector;
import com.codeball.designpatterns.di.ProcessMessaage;
import com.codeball.designpatterns.di.SMSServiceInjector;

public class TestDIPattern {

	public static void main(String[] args) {
		String msg = "Test msg";
		String email = "test@abc.com";
		String phone = "8877887788";
		MessageServiceInjector injector = null;
		ProcessMessaage processMsg = null;
		
		//Email
		injector = new EmailServiceInjector();
		processMsg = injector.getProcessMessage();
		processMsg.processMsg(msg, email);
		
		//SMS
		injector = new SMSServiceInjector();
		processMsg = injector.getProcessMessage();
		processMsg.processMsg(msg, phone);
	}


}
