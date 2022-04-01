package com.java8features;

interface DefaultMethodInterface {
	// Abstract method
	void abstractMethod();

	// Default method having method body
	default void defaultMethod() {
		System.out.println("Hello, I am coming from default method in Interface");
	}
}


//Class implementing the interface
public class DefaultMethodExample implements DefaultMethodInterface {

	@Override
	public void abstractMethod() {
		System.out.println("Hello from abstract method");
	}

	public static void main(String[] args) {
		DefaultMethodExample dm = new DefaultMethodExample();
		dm.abstractMethod();
		dm.defaultMethod();
	}
}


