package edu.pragmatic.examples.oop.abstractclasses;

public class Dog extends Mamal {

	@Override
	public void sleep() {
		System.out.println("Sleeps like a boss");
	}
	
	@Override
	public String toString() {
		return "dog" ;
	}

}
