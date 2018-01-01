package arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] someArray = new int[10];
		someArray[0] = 10;
		someArray[1] = 20;
		System.out.println(someArray[0]);
		
		int fifthElement = someArray[4];
		
		int[] otherArray = new int[] {1, 2, 3, 4, 5, 6, 7}; 
		
		System.out.println(someArray);
		for (int i = 0; i < someArray.length; i++) {
			System.out.println((i + 1) + ": " + someArray[i]);
		}
		
		for (int i = 0; i < otherArray.length; i++) {
			System.out.println((i + 1) + ": " + otherArray[i]);
		}
		
		String[] names = new String[5];
		names[0] = "John";
		names[1] = "Barry Allen";
		names[2] = "Batman";
		names[3] = "Djordjano";
		names[4] = "Trump";
		
		for (int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + ": " + names[i]);
		}
		
		String[] cities = new String[] {"Paris", "London", "Sofia", null, "Kasspi4an"};
		for (String city: cities) {
			System.out.println(city);
		}
		
		for (int i = 0; i < cities.length; i++) {
			if (cities[i] != null) {
				System.out.println(cities[i]);
			}
		}
	}
}