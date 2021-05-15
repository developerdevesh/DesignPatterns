package com.codeball.designpatterns.singleton;

/**
 * Singleton with eager initialization instance is initialized at the time of
 * class loading
 * 
 * @author devesh.singh
 *
 */
public class SingletonBillPugh {

	private SingletonBillPugh() {
	}

	private static class SingletonCreator {
		private static final SingletonBillPugh instance = new SingletonBillPugh();
	}

	public static SingletonBillPugh getInstance() {
		return SingletonCreator.instance;
	}

}
