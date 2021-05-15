package com.codeball.designpatterns;

import com.codeball.designpatterns.singleton.SingletonThreadSafe1;

public class DesignPatternMain {

	public static void main(String[] args) {
		
		SingletonThreadSafe1 singletonThreadSafe1v1=SingletonThreadSafe1.getInstance();
		SingletonThreadSafe1 singletonThreadSafe1v2=SingletonThreadSafe1.getInstance();
		
		System.out.println("Object value = "+singletonThreadSafe1v1);
		System.out.println("Object value = "+singletonThreadSafe1v2);
	}
	
}
