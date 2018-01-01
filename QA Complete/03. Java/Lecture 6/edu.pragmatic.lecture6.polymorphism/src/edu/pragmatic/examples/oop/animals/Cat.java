package edu.pragmatic.examples.oop.animals;

public abstract class Cat extends Animal{
	
	public void climb() {
		System.out.println("Climbing...");
	}
	
	@Override
	public void play() {
		System.out.println("Playing like a cat...");
	}
	
	@Override
	public void walk() {
		System.out.println("Walking like a cat...");
	}

	@Override
	public void sing() {
		System.out.println("The cat sings like a cat");
	}

}
