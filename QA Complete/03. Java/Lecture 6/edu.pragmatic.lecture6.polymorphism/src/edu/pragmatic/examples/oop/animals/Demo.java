package edu.pragmatic.examples.oop.animals;

public class Demo {
	public static void main(String[] args) {
		Zoo zoo = new Zoo(10);
		Animal cat = new LuF();
		Dog dog = new Dog();
		Bird bird = new Bird();
		
		zoo.addAnimal(cat);
		zoo.addAnimal(dog);
		zoo.addAnimal(bird);
		
		Animal[] animals = zoo.getAnimals();
		
		for (int i = 0 ; i < animals.length ; i ++){
			Animal animal = animals[i];
			if (animal != null){
				animal.makeSomeNoise();
			}
		}

	}
}
