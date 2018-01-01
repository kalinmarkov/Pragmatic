package edu.pragmatic.finalexam;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class Application {
	
	public static void main(String[] args) {
		System.out.println("App started.");
		TextReader reader = new TextReader();
		reader.readUserInput();
		String userInput = reader.getUserInput();
		System.out.println("[Debug] User has entered "
							+ userInput);
		SymbolCounter symbolCounter = new SymbolCounter();
		Map symbolCount = symbolCounter.count(userInput);
		Set symbols = symbolCount.keySet();
		for (Object symbol : symbols) {
			System.out.printf("%s -> %d\n", 
					symbol, symbolCount.get(symbol));
		}
		
		
		System.out.println("App ended.");
	}

}
