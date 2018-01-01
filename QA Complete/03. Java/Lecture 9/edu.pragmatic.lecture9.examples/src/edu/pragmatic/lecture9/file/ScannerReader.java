package edu.pragmatic.lecture9.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReader {

	public static void main(String[] args) {
		try {
			Scanner textFileReader = new Scanner(
					new File("C:\\Users\\peterm\\Dropbox\\Pragmatic Java Course\\QA_COMPLETE\\QA_9\\Lecture 9\\Examples\\edu.pragmatic.lecture9.examples\\resources\\sampleText.txt"));
			while(textFileReader.hasNextLine()) {
				String currentLine = textFileReader.nextLine();
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("End of application");
	}
	
}
