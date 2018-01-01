package edu.pragmatic.examples.classes;

public class Person {

	String name;
	int age;
	long personalID;
	boolean isMale;
	double weight;
	String address;
	Person friend;
	
	void eat() {
		System.out.println(name + " is eating...");
	}
	
	void walk() {
		System.out.println("Walking...");
	}
	
	void growUp() {
		System.out.println("Growing with one year");
		age++;
	}
	
	void drinkWater(double liter) {
		if(liter > 1) {
			System.out.println("Too much water for drinking...");
		} else {
			System.out.println("Drinking " + liter + "l water");
		}
	}
}
