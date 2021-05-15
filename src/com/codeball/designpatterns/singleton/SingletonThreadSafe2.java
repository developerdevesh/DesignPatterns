package com.codeball.designpatterns.singleton;

/**
 * Singleton with synchronized block/volatile Lazy initialization
 * 
 * @author devesh.singh
 *
 */
public class SingletonThreadSafe2 {

	private static volatile SingletonThreadSafe2 instance;
	private static final Object mutex = new Object();

	private SingletonThreadSafe2() {

	}

	/**
	 * Block level lock result variable increases performance
	 * 
	 * @return
	 */
	public static SingletonThreadSafe2 getInstance() {
		// Memory optimization with result object as it will not return value from main
		// memory(volatile) if instance is already initialized
		SingletonThreadSafe2 result = instance;

		if (result == null) {
			synchronized (mutex) {
				result = instance;
				if (result == null) {
					instance = result = new SingletonThreadSafe2();
				}
			}
		}
		return result;
	}

}
