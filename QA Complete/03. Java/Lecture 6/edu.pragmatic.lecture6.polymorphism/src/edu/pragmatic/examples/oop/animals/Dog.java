package edu.pragmatic.examples.oop.animals;

public class Dog extends Animal{
	
	protected String name;
	
	public void bringStick(){
		System.out.println("Yo bring the stick!");
	}
	
	@Override
	public void makeSomeNoise() {
		System.out.println("Bau Bau");
	}

	@Override
	public void play() {
		System.out.println("Playing with stick");
		bringStick();
	}
	
	@Override
	public void walk() {
		System.out.println("Walking like a dog");
	}

	@Override
	public void sing() {
		System.out.println("The dog doesn't sing, he smiles");
	}
	
}
