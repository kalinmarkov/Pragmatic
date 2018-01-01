package com.pragmatic.lesson7.inheritance.finalkeyword;

import java.util.Date;

public class FinalExample {
	
	private final String name;
	
	public FinalExample() {
		name = "Pesho";
	}

	public final void printCurrentDate(){
		System.out.println(new Date());
	}
}
