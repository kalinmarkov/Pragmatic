package edu.pragmatic.examples.oop.animals;

public class Eagle extends Bird{
	//overload
	public void fly(int meters) {
		System.out.println("FLying highly like a eagle");
	}
	
	//override
	public void fly() {
		System.out.println("FLying highly like a eagle");
	}
	
	// compilation error: Cannot reduce the visibility of the inherited method from Bird
//	private void fly() {
//		System.out.println("FLying highly like a eagle");
//	}
}
