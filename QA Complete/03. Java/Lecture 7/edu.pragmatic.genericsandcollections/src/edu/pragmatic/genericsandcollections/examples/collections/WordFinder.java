package edu.pragmatic.genericsandcollections.examples.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordFinder {
	
	private static final Set<String> exclusionList = new HashSet<>();
	
	static {
		exclusionList.add(",");
		exclusionList.add(" ");
		exclusionList.add(".");
		exclusionList.add(" ");
		exclusionList.add("-");
	}
	
	private List<String> readText(String path){
		try (Scanner fileReader = new Scanner(new File(path))){
			List<String> lines = new ArrayList<>();
			while (fileReader.hasNext()){
				lines.add(fileReader.nextLine());
			}
			
			return lines;
		} catch (FileNotFoundException e) {
			System.err.println("No File found at " + path);
		}
		
		return null;
	}
	
	private String[] splitLineToWords(String line) {
		String[] words = line.split("[ ]");
		return words;
	}
	
	private Collection<String> getOrderdUniqueWords(List<String> lines){
		Collection<String> uniqueWords = new TreeSet<>();
		for (String line : lines) {
			String[] words = splitLineToWords(line);
			for (String word : words){
				if (!exclusionList.contains(word)){
					uniqueWords.add(word);
				}
			}
		}
		
		return uniqueWords;
	}
	
	public Collection<String> getUniqueOrderedWordsFromAFile(String filePath){
		List<String> readLines = this.readText(filePath);
		return getOrderdUniqueWords(readLines);
	}
	
	public static void main(String[] args) {
		WordFinder finder = new WordFinder();
		String path = "src/edu/pragmatic/genericsandcollections/examples/collections/Fleur_de_Mal_Poison.txt";
		Collection<String> uniqueOrderedWordsFromAFile = finder.getUniqueOrderedWordsFromAFile(path);
		for (String word : uniqueOrderedWordsFromAFile) {
			System.out.println(word);
		}
	}
	
}
