package com.pragmatic.lesson7.inheritance.constructors;

public class B extends A{

	public B() {
		super(4);
		System.out.println("Default B()");
	}
	
	public B(String name) {
		super(8);
		System.out.println("Calling constructor of class B");
	}
	
}
