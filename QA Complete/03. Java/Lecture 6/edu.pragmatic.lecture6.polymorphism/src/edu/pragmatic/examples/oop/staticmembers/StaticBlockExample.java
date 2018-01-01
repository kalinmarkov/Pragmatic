package edu.pragmatic.examples.oop.staticmembers;

public class StaticBlockExample {
	
	public static void main(String[] args) {
		System.out.println("Program Started");
		System.out.println(StaticBlock.getPI());
		System.out.println(StaticBlock.getPI());
		// StaticBlock staticInitializer = new StaticBlock();
	}

}
