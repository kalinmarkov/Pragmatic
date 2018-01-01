package edu.pragmatic.lecture9.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MyWriter {
	public void write(String path, String content) throws FileNotFoundException {
		File file = new File(path);
		PrintWriter printer = new PrintWriter(file);
		printer.println(content);
		printer.flush();
		printer.close();
	}

}
