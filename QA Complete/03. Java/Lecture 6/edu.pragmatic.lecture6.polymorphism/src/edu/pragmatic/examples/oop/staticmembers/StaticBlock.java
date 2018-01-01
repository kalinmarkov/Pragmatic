package edu.pragmatic.examples.oop.staticmembers;


public class StaticBlock {
	
	private String privateField ; 
	private static Double PI = 2.14;
	
	public StaticBlock(){
		privateField = "some private field";
		System.out.println("Creating a new instance of type " + getClass().getName());
	}
	
	static{
		System.out.println("Pi value before " + PI);
		PI = Math.PI;
		System.out.println("Calling the static block");
	}
	
	public static void setPI(double newPiValue){
		PI = newPiValue;
	}
	
	public static Double getPI(){
		return PI;
	}

}
