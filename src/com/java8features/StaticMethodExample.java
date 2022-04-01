package com.java8features;

interface StaticMethodInterface {
	
	// This is a default method so we need not
	default void defaultMethod() {
		System.out.println("Hello from default method.");
	}

	/* This is a static method. Static method in interface is
	 * similar to default method except that we cannot override
	 * them in the implementation classes.
	 */
	static void staticMethod() {
		System.out.println("Hello from static method");
	}
	void existingMethod(String str);
}



public class StaticMethodExample implements StaticMethodInterface {
	
	// implementing abstract method
	public void existingMethod(String str) {
		System.out.println("String is: "+str);
	}
	public static void main(String[] args) {
		StaticMethodExample obj = new StaticMethodExample();

		// Calling the default method of interface
		obj.defaultMethod();
		// Calling the static method of interface
		StaticMethodInterface.staticMethod();
		// Calling the abstract method of interface
		obj.existingMethod("Java 8 has added static methods and default methods");

	}
}

