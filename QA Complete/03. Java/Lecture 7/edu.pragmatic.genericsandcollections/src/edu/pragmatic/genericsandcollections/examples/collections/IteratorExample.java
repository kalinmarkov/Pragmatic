package edu.pragmatic.genericsandcollections.examples.collections;

import java.util.Arrays;
import java.util.Iterator;

public class IteratorExample {

	public static void iterate(Iterator<String> i) {
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

	public static void main(String[] args) {
		String[] names = { "John", "George", "Alex" };
		iterate(Arrays.asList(names).iterator());
	}

}
