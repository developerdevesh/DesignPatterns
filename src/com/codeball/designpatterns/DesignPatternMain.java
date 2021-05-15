package com.codeball.designpatterns;

import com.codeball.designpatterns.singleton.SingletonBillPugh;

public class DesignPatternMain {

	public static void main(String[] args) {

//		SingletonSyncronizedMethod instance1=SingletonSyncronizedMethod.getInstance();
//		SingletonSyncronizedMethod instance2=SingletonSyncronizedMethod.getInstance();
		
//		SingletonSynchronizedBlock instance1 = SingletonSynchronizedBlock.getInstance();
//		SingletonSynchronizedBlock instance2 = SingletonSynchronizedBlock.getInstance();
		
//		SingletonLazyInitialization instance1 = SingletonLazyInitialization.getInstance();
//		SingletonLazyInitialization instance2 = SingletonLazyInitialization.getInstance();
		
//		SingletonEagerInitialization instance1 = SingletonEagerInitialization.getInstance();
//		SingletonEagerInitialization instance2 = SingletonEagerInitialization.getInstance();
		
//		SingletonStaticBlockInitialization instance1 = SingletonStaticBlockInitialization.getInstance();
//		SingletonStaticBlockInitialization instance2 = SingletonStaticBlockInitialization.getInstance();
		
		SingletonBillPugh instance1 = SingletonBillPugh.getInstance();		
		SingletonBillPugh instance2 = SingletonBillPugh.getInstance();

		System.out.println("Object value = :" + instance1);
		System.out.println("Object value = :" + instance2);
	}

}
