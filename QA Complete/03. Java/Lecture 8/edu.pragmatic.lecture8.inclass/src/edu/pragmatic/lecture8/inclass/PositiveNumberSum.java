package edu.pragmatic.lecture8.inclass;

public class PositiveNumberSum {
	
	public int sum(int left, int right) {
		if (left < 0 || right < 0) {
			throw new PositiveNumberException();
		}
		
		return left + right ;
	}

	public static void main(String[] args) {
		
		PositiveNumberSum positiveNumberSum = new PositiveNumberSum();
		try {
			positiveNumberSum.sum(8,  9);
			positiveNumberSum.sum(10,  9);
			positiveNumberSum.sum(-5,  9);
		} catch (Exception e) {
		}
		System.out.println("App Ended");
		
	}
	
}
