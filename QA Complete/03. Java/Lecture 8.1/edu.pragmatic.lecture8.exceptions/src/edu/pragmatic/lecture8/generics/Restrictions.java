package edu.pragmatic.lecture8.generics;

public class Restrictions<T>  {
	
	// public static T staticField; // this is wrong, you can't have a static type of the generic type
	
	// valid you can create static methods with their own generic argument
	public static <P> void staticMethod(P p){ 
		// do something
	} 
	
}
