package edu.pragmatic.genericsandcollections.examples.collections;

import java.util.Collections;
import java.util.List;


public class CollectionsDemo {

	public static void main(String[] args) {
		List<String> cardDeck = ListExample.buildACardDeck();
		printCardDeck(cardDeck);
		System.out.println("Shuffle....");
		Collections.shuffle(cardDeck);
		printCardDeck(cardDeck);
	}
	
	private static void printCardDeck(List<?> cardDeck){
		for (int i =0; i < cardDeck.size(); i++){
			Object card = cardDeck.get(i);
			System.out.print(card + " ");
			if (( i + 1 ) % 4 == 0 ){
				System.out.println();
			}
		}
	}
	
}
