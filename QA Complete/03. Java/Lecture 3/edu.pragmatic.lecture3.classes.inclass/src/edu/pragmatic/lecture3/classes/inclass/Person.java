package edu.pragmatic.lecture3.classes.inclass;

public class Person {
	
	int age;
	String name;
	String phoneNumber;
	boolean sex;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	void eat() {
		int  num = 44;
		System.out.println(name + " eats something! Num num num!");
	}
	
	void drinkWater(int liters) {
		this.name = "";
		System.out.println( this.name + " drinks " + liters );
	}
	
	void rename(String newName) {
		name = newName;
	}
	
	int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		
		Person jorko ;
		
		jorko = new Person("George" , 5);
//		jorko.name = "George";
		jorko.eat();
		jorko.rename("Stoqn");
		jorko.drinkWater(4);
		System.out.println(jorko.name + " is " + jorko.getAge() + " years old");
		
		
		String lastName = "Ivanov";
		{
			String middleName = "Stoqnov";
			System.out.println(middleName + lastName);
		}
		
	}
	
}
