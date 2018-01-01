package edu.pragmatic.examples.oop.animals;


public class Zoo implements IZoo {
	// private List animals;
	private Animal[] animals;
	
	public Zoo(int cages) {
		// animals = new ArrayList();
		animals = new Animal[5];
	}
	
	public void addAnimal(Animal animalToAdd) {
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] == null) {
				animals[i] = animalToAdd;
				return;
			}
		}
//		this.animals.add(animalToAdd);
	
	}
	
	public void freeAllAnimals(){
		// this.animals = new ArrayList<>();
		this.animals = new Animal[5];
	}
	
	public void walkAnimal(Animal animal) {
		animal.walk();
		//if animal is bird, sing...
		if(animal instanceof Bird) {
			((Bird)animal).sing();
		}
	}
	
	public void walkAnimals() {
//		for (int i = 0; i < animals.length; i++) {
//			Animal animal = animals[i];
//			if(animal == null) {
//				continue;
//			}
//			animal.walk();
//			animal.makeSomeNoise();
//		}
//		
		for (Object animal : this.animals) {
			Animal an = (Animal)animal;
			an.walk();
			an.makeSomeNoise();
		}
	}

	public Animal[] getAnimals() {
		return this.animals;
	}
}
