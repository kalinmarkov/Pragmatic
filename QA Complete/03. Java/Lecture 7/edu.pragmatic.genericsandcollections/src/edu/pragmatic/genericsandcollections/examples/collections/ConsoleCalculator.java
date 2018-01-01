package edu.pragmatic.genericsandcollections.examples.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleCalculator {
	
	public static void main(String[] args) {
		try(Scanner console = new Scanner(System.in)){
			List<Integer> numbers = new ArrayList<>();
			
			while(true){
				String wanabeNumber = console.nextLine();
				int number = Integer.valueOf(wanabeNumber);
				if (number == 0) break;
				
				numbers.add(number);
			}
			
			int sum = 0;
			for (Integer i : numbers) {
				sum += i;
			}
			
			System.out.println(String.format("Sum of your numbers is %d ", sum));
		}
	}

}
