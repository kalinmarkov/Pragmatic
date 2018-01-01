package edu.pragmatic.lecture9.file;

import java.io.File;

public class RootReader {
	
	public static void main(String[] args) {
		String path = "C:/capicom_dc_sdk.msi/sdasa";
		File file = new File(path);
		file.isDirectory();
		file.delete();
		file.listFiles();
		
	}

}
