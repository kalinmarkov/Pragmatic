package edu.pragmatic.lecture8.generics;

public class Stat<T extends Number> {

	private T[] numbers;
	
	public Stat(T[] numbers)  {
		this.numbers = numbers;
	}
	
	public double getAverageValue(){
		
		Double sum = 0D;
		for (int i = 0; i < numbers.length ; i++){
			sum += numbers[i].doubleValue();
		}
		
		return sum / numbers.length;
	}
	
	
	public boolean isSameAverage(Stat<?> otherStat){
		return getAverageValue() == otherStat.getAverageValue();
	}
	
	public static void main(String[] args) {
		Stat<Integer> someInts = new Stat<>(new Integer[]{1, 2, 3, 4, 5});
		Stat<Double> someDoubles = new Stat<>(new Double[]{1D, 2D, 3D, 4D, 5D,});
		System.out.println(someInts.isSameAverage(someDoubles));
	}
}
