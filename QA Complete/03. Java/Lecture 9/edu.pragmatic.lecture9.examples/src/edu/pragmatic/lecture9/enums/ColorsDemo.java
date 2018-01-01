package edu.pragmatic.lecture9.enums;


public class ColorsDemo {
	
	
	public static final Integer PURPLE = 5;
//	
//	public void see(int color) {
//		System.out.println(color);
//	}
	
	public void see(Colors color) {
		System.out.println(color);
	}

	public static void main(String[] args) {
		String name = null;
		System.out.println( Colors.GREEN.equals(name) );
	}
	
}
