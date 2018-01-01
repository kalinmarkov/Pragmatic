package edu.pragmatic.lecture8.generics;

public class Generic<T> {
	
	private T field;

	public Generic(T field) {
		this.field = field;
	}

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}
	
	public void printGenericType(){
		System.out.println("Generic Filed is of type  " + field.getClass().getName());
	}
	
	public static void main(String[] args) {
		Generic<String> str = new Generic<String>("This is my field");
		str.printGenericType();
		
		Generic<Number> num = new Generic<Number>(5d);
		num.printGenericType();
		
	}
	
}
