package com.codeball.designpatterns.singleton;

/**
 * Singleton with static block initialization Similar as Eager initialization
 * along with exception handling
 * 
 * @author devesh.singh
 *
 */
public class SingletonStaticBlockInitialization {

	private static SingletonStaticBlockInitialization instance;

	private SingletonStaticBlockInitialization() {
	}

	// static block initialization, exception handling
	static {
		try {
			instance = new SingletonStaticBlockInitialization();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance static block initialization");
		}
	}

	public static SingletonStaticBlockInitialization getInstance() {
		return instance;
	}

}
