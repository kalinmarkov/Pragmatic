package edu.pragmatic.examples.oop.abstractclasses;

public interface Animal {
	
	default void eat(){
		System.out.println(this + " is eating a lovely meal");
	};
	
	void move();
	
	void sleep();
	
	static void singMeASong(Animal anAnimal){
		System.out.println(anAnimal + " is singing a lovely song");
	}
}
