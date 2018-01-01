package edu.pragmatic.lecture5.inheritance.inclass;

public class Demo {

	public static void main(String[] args) {
		ReusingConstructors cons = 
				new ReusingConstructors(19, "Petkan");
		System.out.println(cons.hour);
		System.out.println(cons.name);
		System.out.println(cons.money);
	}
	
}
