package com.codeball.designpatterns.singleton;

import java.lang.reflect.Constructor;

/**
 * Destroy singleton pattern using Reflection method 
 * 
 * @author devesh.singh
 *
 */
public class DestroySingletonUsingReflection {
	
	
	public static void main(String[] args) {
		
		//first instance by singleton
		 SingletonLazyInitialization instance1 = SingletonLazyInitialization.getInstance();
		 SingletonLazyInitialization instance2 = SingletonLazyInitialization.getInstance();
		 
		    System.out.println("Instance1: "+instance1.hashCode());
	        System.out.println("Instance2: Before reflection: "+instance2.hashCode());
		 
	        try {
	            Constructor[] constructors = SingletonLazyInitialization.class.getDeclaredConstructors();
	            for (Constructor constructor : constructors) {
	                //Below code will destroy the singleton pattern
	                constructor.setAccessible(true);
	                //second instance using reflection
	                instance2 = (SingletonLazyInitialization) constructor.newInstance();
	                break;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        System.out.println("Instance1: "+instance1.hashCode());
	        System.out.println("Instance2: After reflection: "+instance2.hashCode());
		
	}

}
