package edu.pragmatic.lecture5.inheritance.inclass;

public class Animal {

	protected String name;
	private int age;
	private double weight;
	private int milleage;

	protected void walk() {
//		System.out.println("The animal walks");
		milleage += 10;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getMilleage() {
		return milleage;
	}

}
