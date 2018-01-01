package edu.pragmatic.loops.inclass;

import java.util.Scanner;

public class GameExercice {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		boolean looping = true;
		while (looping) { 
			System.out.println( // QA_9
					"Please chose your direction: left, right, forward, backwards");
			String direction = console.nextLine();
			System.out.println("[System] The user chose: " + direction);
			switch (direction) {
			case "left":
				System.out.println("You've reached the bakery!");
			    System.out.println("How much gold do you have ?");
			    int money = console.nextInt();
			    System.out.println("[System] The user has: " + money);
			    if ( money < 10 ) {
			    	System.out.println("Go Home you poor bastard!");
			    }else {
			    	System.out.println("You get a nice piece of baniza");
			    }
			    break;
			case "backwards" : 
				System.out.println("Sorry! Game over!");
				looping = false ;
				break; 
			default:
				System.out.println(
						"I am sorry I can't understand what " + direction + " is!");
				break;
		    }
		}
	}
		
}
