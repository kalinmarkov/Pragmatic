package edu.pragmatic.lecture5.inheritance.inclass;

public class Flea extends Animal {

	Dog dog;
	
	public Flea(String name) {
		this.name = name;
	}

	void drinkBlood() {
		System.out.println(name + " drinks the blood of the dog " + dog.name);
	}
	
	
}
