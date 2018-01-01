package edu.pragmatic.examples.oop.animals;

public class Bird extends Animal{
	private double flyingSpeed;
	protected String tone;
	String featherColor;
	public String name;
	
	public Bird(){
		
	}
	
	public Bird(String tone) {
		this.tone = tone;
		this.age = 4;
	}
	
	public void fly() {
		System.out.println("Flying...");
	}

	@Override
	public void makeSomeNoise() {
		System.out.println("Piu piu");
	}

	@Override
	public void play() {
	}
	
	@Override
	public void walk() {
		System.out.println("Walking like a bird");
	}
	
	public void sing() {
		System.out.println("Singing with " + tone);
	}
}
