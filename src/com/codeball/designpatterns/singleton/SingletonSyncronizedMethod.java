package com.codeball.designpatterns.singleton;

/**
 * Singleton with class level lock (synchronized on static method)
 * 
 * @author devesh.singh
 *
 */
public class SingletonSyncronizedMethod {

	private static SingletonSyncronizedMethod instance;

	private SingletonSyncronizedMethod() {

	}

	public static synchronized SingletonSyncronizedMethod getInstance() {

		
		SingletonSyncronizedMethod result = instance;

		if (result != null) {
			return result;
		} else {
			if (result == null) {
				instance = new SingletonSyncronizedMethod();
			}
			return instance;
		}

	}

}
