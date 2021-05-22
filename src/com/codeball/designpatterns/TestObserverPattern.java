package com.codeball.designpatterns;

import com.codeball.designpatterns.observer.BCAClassObserver;
import com.codeball.designpatterns.observer.MCAClassObserver;
import com.codeball.designpatterns.observer.Subject;

public class TestObserverPattern {

	public static void main(String[] args) {
		
		Subject subject = new Subject();

	      new MCAClassObserver(subject);
	      new BCAClassObserver(subject);

	      System.out.println("First progress change: 5");	
	      subject.setProgress(5);
	      System.out.println("Second progress: 10");	
	      subject.setProgress(10);
	}
	
}
