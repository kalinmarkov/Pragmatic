package animals;

public class Zoo {
	private Animal[] animals;
	
	public Zoo(int count) {
		animals = new Animal[count];
	}
	
	public void addAnimal(Animal animal) {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				animals[i] = animal;
				return;
			}
		}
		
		System.out.println("Няма повече място. Намерете си друго филмче!!");
	}

	public Animal[] getAnimals() {
		return animals;
	}
	
	public void walkAnimals() {
		for (Animal animal : animals) {
			if (animal != null) {
				animal.walk();
				animal.makeSomeNoise();
				
				if (animal instanceof NinjaTurtle) {
					NinjaTurtle realTurtle = (NinjaTurtle) animal; // long
					((NinjaTurtle) animal).fight(); // short
					realTurtle.fight();
				}
			}
		}
	}
}