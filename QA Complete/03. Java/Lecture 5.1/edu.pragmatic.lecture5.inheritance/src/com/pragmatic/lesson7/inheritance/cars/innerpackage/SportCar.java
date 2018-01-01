package com.pragmatic.lesson7.inheritance.cars.innerpackage;

import com.pragmatic.lesson7.inheritance.cars.Car;

public class SportCar extends Car{
	private boolean isCabriolet;
	private double price;
	
	public SportCar() {
		super("BMW");
	}
	
	void switchTurbo() {
		//compile error
//		if(gear == 5) {
//			System.out.println("Switch turbo");
//		} else {
//			System.out.println("You have to be on 5th gear!");
//		}
	}
}
