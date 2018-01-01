package edu.pragmatic.lecture9.practice;

public class GenericNumberDemo {
	public static void main(String[] args) {
		GenericNumber<Integer> gn = new GenericNumber<Integer>();
		gn.setNum1(10);
		Integer num2 = gn.getNum2();
		
		GenericNumber<Double> gnd = new GenericNumber<Double>();
		gnd.setNum1(12.3);
	}
}