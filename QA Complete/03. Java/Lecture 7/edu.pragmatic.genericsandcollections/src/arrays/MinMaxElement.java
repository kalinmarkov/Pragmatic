package arrays;

import java.util.Scanner;

public class MinMaxElement {
	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Моля въведете елемент " + (i + 1) + ":");
			array[i] = scanner.nextInt();
		}
		
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			
			if (min > array[i]) {
				min = array[i];
			}
		}
		
		System.out.println(String.format("Минималното число е %d, а максималното %d", min, max));
	}
}