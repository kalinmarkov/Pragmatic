package edu.pragmatic.examples.oop.animals;

import java.util.List;

public class ZooDemo {
	public static void main(String[] args) {
		Zoo sofiaZoo = new Zoo(5);
		
		//!!!
		Animal sharo = new Dog();
		Animal tomas = new LuF();
		
		sharo.walk();
		((Dog)sharo).bringStick();
		
		sofiaZoo.addAnimal(sharo);
		sofiaZoo.addAnimal(tomas);
		
//		sharo.walk();
//		pissi.walk();
		sofiaZoo.walkAnimals();
		
		Animal animal = new Bird();
		//compilation error
		//bird.sing();

//		List animalList = (List) animal;
		
		System.out.println( animal instanceof List  ? "animal is a list" : " animal is NOT a list");
		
		if(animal instanceof Bird) {
			((Bird)animal).sing();
		}
		
		
		Zoo zoo = new Zoo(10);
		Animal cat = new LuF();
		Dog dog = new Dog();
		Bird bird = new Bird();
		
		zoo.addAnimal(cat);
		zoo.addAnimal(dog);
		zoo.addAnimal(bird);
		
		Animal[] animalsInTheZoo = zoo.getAnimals();
		
		for (int i = 0; i < animalsInTheZoo.length; i++) {
			if(animalsInTheZoo[i] != null) {
			   animalsInTheZoo[i].walk();
			   animalsInTheZoo[i].makeSomeNoise();
			}
		}	

		
	}
		
}
