package edu.pragmatic.examples.oop.animals;

public abstract class Animal {
	protected int age;
	protected double weight;

	protected boolean isDangerous; 
	
	public void breathe() {
		System.out.println("Breating...");
	}
	
	public void walk() {
		System.out.println("Walking like an animal");
	}
	
	public abstract void makeSomeNoise();
	public abstract void play();
	
	public abstract void sing();
}
