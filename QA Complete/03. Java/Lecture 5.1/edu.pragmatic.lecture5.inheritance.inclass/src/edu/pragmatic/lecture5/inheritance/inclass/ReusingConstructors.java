package edu.pragmatic.lecture5.inheritance.inclass;

public class ReusingConstructors {
	
	int hour ;
	String name;
	double money;
	
	public ReusingConstructors() {
		this(12);
		System.out.println("Default Constructor (no args)");
	}
	
	ReusingConstructors(double money){
		this.money = money;
	}
	
	ReusingConstructors(int hour, String name){
		this(12);
		this.hour = hour;
		this.name = name;
	}

	public static void main(String[] args) {
		
	}
}
