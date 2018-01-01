package edu.pragmatic.genericsandcollections.examples.collections;

import java.util.Scanner;
import java.util.Stack;

public class CollectionDemo {
	
	public static void main(String[] args) {
		try(Scanner console = new Scanner(System.in)){
			System.out.println("Enter a number:");
			int number = 0;
			Stack<Integer> readNums = new Stack<Integer>();
//			Queue<Integer> readNums = new LinkedList<>();
//			List<Integer> readNums = new ArrayList<>();
			while (number != -1){
				 String rawNumber = console.nextLine();
				 try {
					number = Integer.parseInt(rawNumber);
					readNums.push(number);
				 } catch (NumberFormatException e) {
					System.err.printf("Sorry %s is not a number, dude!\n", rawNumber);
				 }
			}
//			
//			for (Integer num : readNums )
//				System.out.printf("%d ", num);
//			}
//			
			int size = readNums.size();
			for (int i = 0; i < size; i++){
				Integer num = readNums.pop();
				System.out.printf("%d ", num);
			}
			
//			Iterator<Integer> numIterator = readNums.iterator();
//			for (;numIterator.hasNext();){
//				Integer num = numIterator.next();
//				System.out.printf("%d ", num);
//			}
		}
	}

}
