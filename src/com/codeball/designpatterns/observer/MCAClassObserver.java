package com.codeball.designpatterns.observer;

public class MCAClassObserver extends Observer {

	public MCAClassObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("BCA class progress updated to: " + subject.getProgress());
	}
}