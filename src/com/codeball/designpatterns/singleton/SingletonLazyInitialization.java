package com.codeball.designpatterns.singleton;

/**
 * Singleton with Lazy initialization
 * 
 * @author devesh.singh
 *
 */
public class SingletonLazyInitialization {

	private static SingletonLazyInitialization instance;

	private SingletonLazyInitialization() {
	}

	public static SingletonLazyInitialization getInstance() {
		if (instance == null) {
			instance = new SingletonLazyInitialization();
		}
		return instance;

	}

}
