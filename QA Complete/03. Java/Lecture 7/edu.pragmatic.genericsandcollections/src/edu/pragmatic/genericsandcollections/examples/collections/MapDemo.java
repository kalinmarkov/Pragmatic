package edu.pragmatic.genericsandcollections.examples.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> smsDictionary  = new Hashtable<>();
		smsDictionary.put("kiss", "{");
		smsDictionary.put("hello", "zdrasti");
		
		try(Scanner console = new Scanner(System.in)){
			while(true){
				System.out.println("Enter word or exit to exit");
				String word = console.nextLine();
				if (word.equalsIgnoreCase("exit")){
					break;
				}
				
				String smsdWord = smsDictionary.get(word);
				if (smsdWord != null){
					System.out.printf("Translation of %s is %s \n", word , smsdWord );
				}else {
					System.out.println(word + " not found in Dictionary");
				}
			}
		}
		
	}
	
}
