package edu.pragmatic.examples.classes;

public class PersonDemo {
	public static void main(String[] args) {
		Person ivan = new Person();
		Person maria = new Person();
		
		ivan.name = "Ivan Petrov";
		ivan.age = 23;
		ivan.weight = 85.5;
		ivan.personalID = 790202;
		ivan.isMale = true;
		System.out.println("Ivan is " + ivan.age + " years old.");
		
		ivan.friend = maria;
		
		maria.name = "Maria Ilieva";
		//maria = ivan;
		System.out.println("Maria is " + maria.age + " years old.");
		
		ivan.eat();
		maria.eat();
		
		ivan.growUp();
		System.out.println("Ivan age:" + ivan.age);
		
		maria.drinkWater(0.5);
		
	}
}
