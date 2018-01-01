package edu.pragmatic.lecture8.generics;

public class GenericMethod<T> {
	
	private T field;
	
	public <P> P showType(P arg) {
		Generic<P> g = new Generic<P>(arg);
		g.printGenericType();
		
		return arg;
	}

	
	public static void main(String[] args) {
		GenericMethod g = new GenericMethod();
		
		g.showType("Hello");
		
	}
	
}
