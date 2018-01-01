package edu.pragmatic.genericsandcollections.examples.generics;

public class GenericCatalogTest {
	public static void main(String[] args) {
		GenericCatalog<String> catalog = new GenericCatalog<String>();
		catalog.add("first");
		catalog.add("second");
		catalog.add("third");

		String[] strArr = catalog.toArray(String.class);

		for (String element : strArr) {
			System.out.println(element);
		}

		GenericCatalog<StringBuilder> numbers = new GenericCatalog<>();
		numbers.add(new StringBuilder());
	}
}
