package com.codeball.designpatterns.singleton;

/**
 * Singleton inner class | lazy initialization | thread safe 
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
