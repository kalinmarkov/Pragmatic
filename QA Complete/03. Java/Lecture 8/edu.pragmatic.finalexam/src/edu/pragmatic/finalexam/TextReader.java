package edu.pragmatic.finalexam;

import java.util.Scanner;

public class TextReader {

	private StringBuilder input = new StringBuilder();
	
	public String getUserInput() {
		return input.toString();
	}

	public void readUserInput() {
		Scanner console = new Scanner(System.in);
		while (true) {
			String currentInput = console.nextLine();
			if (currentInput.equals("<stop>"))
				return;
			input.append(currentInput);
		}
	}
	
}
