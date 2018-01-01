package edu.pragmatic.lecture8.generics;

public class ArrayRestrictions<T extends Number> {
	
	private T[] nums;
	
	public ArrayRestrictions(){
		// wrong you can't instantiate an array of generics. 
		// What's the arrays type if the generics are only compile time  
		// nums = new T[4];
		
	}
	
	public static void main(String[] args) {
		 // You cannot create an array of type-specific generic references
//		  ArrayRestrictions<Number>[]  nums = new ArrayRestrictions<Number>[4];
		
		// this is OK
		ArrayRestrictions<?>[]  nums = new ArrayRestrictions<?>[4];
	}
	
}
