package edu.pragmatic.genericsandcollections.examples.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	
	public static void main(String[] args) {
		Set<Integer> numbers = buildARandomSetOfNumbers();
		System.out.println(numbers);
	}

	public static Set<Integer> buildARandomSetOfNumbers() {
		Set<Integer> numbers = new HashSet<>();
		
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		numbers.add(2);
		numbers.add(6);
		numbers.add(8);
		numbers.add(10);
		numbers.add(8);
		numbers.add(8);
		numbers.add(4);
		numbers.add(2);
		numbers.add(1);
		numbers.add(1);
		numbers.add(9);
		return numbers;
	}

}
