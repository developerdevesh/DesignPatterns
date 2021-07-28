package com.codeball.designpatterns.singleton;

/**
 * Singleton with synchronized block/volatile Lazy initialization
 * 
 * @author devesh.singh
 *
 */
public class SingletonSynchronizedBlock {

	private static volatile SingletonSynchronizedBlock instance;
	private static final Object mutex = new Object();

	private SingletonSynchronizedBlock() {

	}

	/**
	 * Block level lock result variable increases performance
	 * 
	 * @return
	 */
	public static SingletonSynchronizedBlock getInstance() {
		// Memory optimization with result object as it will not return value from main
		// memory(volatile) if instance is already initialized(The volatile prevents memory writes from being re-ordered, making it impossible for other threads to read uninitialized fields of your singleton through the singleton's pointe)
		SingletonSynchronizedBlock result = instance;

		if (result == null) {
			synchronized (mutex) {
				result = instance;
				if (result == null) {
					instance = result = new SingletonSynchronizedBlock();
				}
			}
		}
		return result;
	}

}
