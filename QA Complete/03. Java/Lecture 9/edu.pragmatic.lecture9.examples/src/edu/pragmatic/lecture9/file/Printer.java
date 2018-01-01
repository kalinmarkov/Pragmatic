package edu.pragmatic.lecture9.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Printer {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		File output= new File("userInput.txt");
		PrintStream printer = new PrintStream(output);
		try {
			while (true) {
				String input = console.nextLine();
				if ("<stop>".equals(input)) {
					printer.flush();
					return;
				}
				printer.println(input);
			}
		}finally {
			System.out.println("Output is at " + output.getAbsolutePath());
		}
		
		
	}
	
}
