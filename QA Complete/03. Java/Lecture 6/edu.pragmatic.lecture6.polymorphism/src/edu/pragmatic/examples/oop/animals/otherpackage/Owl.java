package edu.pragmatic.examples.oop.animals.otherpackage;

import edu.pragmatic.examples.oop.animals.Bird;

public class Owl extends Bird {
	
	private final String finalBirdName;
	
	public static final String SOME_CONST = "myValue";
	
	public Owl(){
		super("owl tone");
		finalBirdName = "some string";
	}
	
	public void printSomeInfo(){
		System.out.println("My bird is " + super.age + " years old");
	}
	
	public static void main(String[] args) {
		final Bird owl = new Owl();
	//	owl = new Owl();
		owl.sing();
		((Owl)owl).printSomeInfo();
	}

}
