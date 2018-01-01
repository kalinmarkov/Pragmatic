package animals;

public class NinjaTurtle extends Animal {

	public NinjaTurtle(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void walk() {
		System.out.println(name + " is walking on sunshine woooho");
	}

	@Override
	public void makeSomeNoise() {
		System.out.println("Kawabanga");
	}
	
	public void fight() {
		System.out.println("buf buf");
	}
}