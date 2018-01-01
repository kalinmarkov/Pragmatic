package edu.pragmatic.examples.oop.cars;

public class SportCar extends Car{
	private boolean isCabriolet;
	private double price;
	// this is not recommended
	boolean isSportCar; 
	
	public SportCar (boolean isCabriolet, double price) {
		super("BMW");
		super.isSportCar = true;
		this.isCabriolet = isCabriolet;
		this.price = price;
	}
	
	void switchTurbo() {
		if(gear == 5) {
			System.out.println("Switch turbo");
		} else {
			System.out.println("You have to be on 5th gear!");
		}
	}

	public boolean isCabriolet() {
		return isCabriolet;
	}

	public double getPrice() {
		return price;
	}

	public boolean isSportCar() {
		return isSportCar;
	}
	
}
