package com.codeball.designpatterns.singleton;

/**
 * Singleton using enum as there is not constructor and can not be broken using
 * reflection but lazy initialization is not achieved
 * 
 * @author devesh.singh
 *
 */
public enum SingletonEnum {

	INSTANCE;

	public static void doSomething() {
		System.out.println("Hi Devesh");
		System.out.println("Enum static method is called");
	}

}
