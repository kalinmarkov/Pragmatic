package animals;

public abstract class Animal {
	protected String name;
	protected int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void breathe() {
		System.out.println("Animal is breathing...");
	}
	
	public void walk() {
		System.out.println("Animal is walking...");
	}
	
	public abstract void makeSomeNoise();
}