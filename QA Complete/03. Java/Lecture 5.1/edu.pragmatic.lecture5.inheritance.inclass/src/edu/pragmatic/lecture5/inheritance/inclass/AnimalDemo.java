package edu.pragmatic.lecture5.inheritance.inclass;

public class AnimalDemo {

	public static void main(String[] args) {
		Cat tom = new Cat();
		Dog scooby = new Dog("Scooby");
		tom.walk();
		scooby.walk();
		scooby.walk("super dog way");
		scooby.walk("super dog way");
		scooby.walk("super dog way");
		System.out.println(scooby.getMilleage()) ;
//		tom.name = "Tomas";
//		tom.climb();
//		Flea nencho = new Flea("Nencho");
//		nencho.dog = scooby;
//		nencho.drinkBlood();
//		nencho.walk();
		//
		// java.util.Scanner console =
		// new java.util.Scanner(System.in);
		// Scanner sc = new Scanner();
	}

}
