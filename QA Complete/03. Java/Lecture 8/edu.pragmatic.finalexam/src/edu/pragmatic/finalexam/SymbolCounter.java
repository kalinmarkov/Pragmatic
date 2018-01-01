package edu.pragmatic.finalexam;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SymbolCounter {
	
	public Map count(String input) {
		char[] symbols = input.toCharArray();
		Map counter = new TreeMap<>();
		for (char symbol : symbols) {
			// ask counter current symbol count
			System.out.println("Counter found symbol " + symbol);
			Integer currentCount = (Integer) counter.get(symbol);
			// if any +1
			System.out.println("Symbol "+ symbol +"current count is " + currentCount);
			if (currentCount != null) {
				counter.put(symbol, currentCount + 1);
				System.out.println("Adding +1");
			}else {
				counter.put(symbol, 1);
				System.out.println("Found symbol for first time");
			}
			// else = 1
		}
		
		return counter;
	}

}
