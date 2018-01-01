package edu.pragmatic.genericsandcollections.examples.generics;

public class GenericMethodExample {

	public static void main(String[] args) {
		int firstInt = 5;
		int secondInt = 3;
		System.out.println("firstInt = " + firstInt);
		System.out.println("secondInt = " + secondInt);
		int greaterInt = greater(firstInt, secondInt);
		System.out.println("Greater: " + greaterInt);

		String firstString = "Java";
		String secondString = "C++";
		System.out.println("firstString = " + firstString);
		System.out.println("secondString = " + secondString);
		String greaterString = greater(firstString, secondString);
		System.out.println("Greater: " + greaterString);
	}

	public static <T extends Comparable<T>> T greater(T element1, T element2) {
		if (element1.compareTo(element2) > 0) {
			return element1;
		} else {
			return element2;
		}
	}

}
