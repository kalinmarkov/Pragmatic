package edu.pragmatic.basicmagic.actions;

import java.util.Random;

public class Dice {
	
	private Random randomGenerator;
	
	public Dice() {
		randomGenerator = new Random();
	}
	
	public int nextRoll() {
		while(true) {
			int roll = randomGenerator.nextInt(6) + 1;
			if (roll <= 6) {
				return roll;
			}
		}
	}
	
}
