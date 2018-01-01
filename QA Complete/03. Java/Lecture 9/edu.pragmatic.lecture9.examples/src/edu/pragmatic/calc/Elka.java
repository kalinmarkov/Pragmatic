package edu.pragmatic.calc;

public class Elka { // smqtaiii

	public int sumOfPositiveNumbers(int left, int right) {
		if (left < 0 || right < 0) {
			throw new IllegalArgumentException(
					"Method can't work with negative args");
		}
		return left + right;
	}
	
}
