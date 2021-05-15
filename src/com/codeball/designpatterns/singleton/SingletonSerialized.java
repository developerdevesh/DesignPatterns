package com.codeball.designpatterns.singleton;

import java.io.Serializable;

/**
 * Singleton | lazy initialization | thread safe | serialized( implement readResolve() method)
 * 
 * @author devesh.singh
 *
 */
public class SingletonSerialized implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private SingletonSerialized() {
	}

	private static class SingletonCreator {
		private static final SingletonSerialized instance = new SingletonSerialized();
	}

	public static SingletonSerialized getInstance() {
		return SingletonCreator.instance;
	}
	
	/**
	 * It ensures that after the deserialization, what object is returned is the same as was serialised 
	 * @return
	 */
	protected Object readResolve() {
	    return getInstance();
	}
	
}
