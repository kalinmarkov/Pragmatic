package edu.pragmatic.lecture5.inheritance.inclass;

public class Dog extends Animal {
	
	private final String doggyName;

	public Dog(String name) {
		this.doggyName = "";
		this.name = name;
	}

	void fetch(String item) {
		System.out.println("The dog fetched " + item);
	}

	void walk(String fashion) {
		super.walk();
		System.out.println("The dog walks in a doggy way." + fashion);
	}

	public void walk() {
		System.out.println("The dog walks in a doggy way.");
		super.walk();
	}

}
