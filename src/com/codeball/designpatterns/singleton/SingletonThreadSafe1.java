package com.codeball.designpatterns.singleton;

/**
 * Singleton with class level lock (synchronized on static method)
 * 
 * @author devesh.singh
 *
 */
public class SingletonThreadSafe1 {

	private static SingletonThreadSafe1 instance;

	private SingletonThreadSafe1() {

	}

	public static synchronized SingletonThreadSafe1 getInstance() {

		
		SingletonThreadSafe1 result = instance;

		if (result != null) {
			return result;
		} else {
			if (result == null) {
				instance = new SingletonThreadSafe1();
			}
			return instance;
		}

	}

}
