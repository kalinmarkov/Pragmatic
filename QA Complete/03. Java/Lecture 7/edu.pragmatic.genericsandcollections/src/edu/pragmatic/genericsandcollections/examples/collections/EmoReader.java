package edu.pragmatic.genericsandcollections.examples.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EmoReader {

	public static final String POEM = "Wine knows how to adorn the most sordid hovel" + "With marvelous luxury "
			+ "And make more than one fabulous portal appear " + "In the gold of its red mist "
			+ "Like a sun setting in a cloudy sky. " + "Opium magnifies that which is limitless, "
			+ "Lengthens the unlimited, " + " Makes time deeper, hollows out voluptuousness, "
			+ " And with dark, gloomy pleasures " + " Fills the soul beyond its capacity. "
			+ " All that is not equal to the poison which flows " + " From your eyes, from your green eyes, "
			+ " Lakes where my soul trembles and sees its evil side... " + " My dreams come in multitude "
			+ " To slake their thirst in those bitter gulfs. " + " All that is not equal to the awful wonder "
			+ " Of your biting saliva, " + " Charged with madness, that plunges my remorseless soul "
			+ " Into oblivion " + " And rolls it in a swoon to the shores of death. " + "- Charles Baudelairs";

	private String[] getAllWords(){
		return POEM.split(" ");
	}
	
	private Map<String, Integer> findWordDensity(){
		Map<String, Integer> wordDensity = new TreeMap<>();
		
		String[] allWords = getAllWords();
		for (String word : allWords) {
			Integer occurrences = 1 ;
			if (wordDensity.containsKey(word)) {
				occurrences = wordDensity.get(word);
				occurrences++;
			}
			wordDensity.put(word, occurrences) ;
		}
		
		return wordDensity;
	}
	
	public static void main(String[] args) {
		EmoReader reader = new EmoReader();
		Map<String, Integer> wordDensity = reader.findWordDensity();
		Set<String> words = wordDensity.keySet();
		for (String  word : words) {
			System.out.println(String.format("%s = %d ", word , wordDensity.get(word) ));
		}
	}
}
