package edu.pragmatic.lecture9.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyReader {
	
	public String read(String pathToFile) throws IOException {
		File file = new File(pathToFile);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();
		
		while (line != null) {
			sb.append(line);
			sb.append(System.lineSeparator());
			line = br.readLine();
		}
		
		return sb.toString();
	}
	
}
