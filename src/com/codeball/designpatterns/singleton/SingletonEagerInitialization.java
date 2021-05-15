package com.codeball.designpatterns.singleton;

/**
 * Singleton with eager initialization instance is initialized at the time of
 * class loading
 * 
 * @author devesh.singh
 *
 */
public class SingletonEagerInitialization {

	private static final SingletonEagerInitialization instance = new SingletonEagerInitialization();

	private SingletonEagerInitialization() {
	}

	public static SingletonEagerInitialization getInstance() {
		return instance;
	}

}
