package edu.pragmatic.genericsandcollections.examples.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> cards = buildACardDeck();
		
		System.out.println(cards);
	}

	public static List<String> buildACardDeck() {
		List<String> cards = new ArrayList<>();
		cards.add("2 of spades");    cards.add("2 of hearts");    cards.add("2 of diamond");    cards.add("2 of clubs");
		cards.add("3 of spades");    cards.add("3 of hearts");    cards.add("2 of diamond");    cards.add("2 of clubs");
		cards.add("4 of spades");    cards.add("4 of hearts");    cards.add("3 of diamond");    cards.add("3 of clubs");
		cards.add("5 of spades");    cards.add("5 of hearts");    cards.add("5 of diamond");    cards.add("4 of clubs");
		cards.add("6 of spades");    cards.add("6 of hearts");    cards.add("6 of diamond");    cards.add("5 of clubs");
		cards.add("7 of spades");    cards.add("7 of hearts");    cards.add("7 of diamond");    cards.add("6 of clubs");
		cards.add("8 of spades");    cards.add("8 of hearts");    cards.add("8 of diamond");    cards.add("7 of clubs");
		cards.add("9 of spades");    cards.add("9 of hearts");    cards.add("9 of diamond");    cards.add("8 of clubs");
		cards.add("10 of spades");   cards.add("10 of hearts");   cards.add("10 of diamond");   cards.add("9 of clubs");
		cards.add("Jack of spades"); cards.add("Jack of hearts"); cards.add("Jack of diamond"); cards.add("10 of clubs");
		cards.add("Queen of spades");cards.add("Queen of hearts");cards.add("Queen of diamond");cards.add("Queen of clubs");
		cards.add("King of spades"); cards.add("King of hearts"); cards.add("King of diamond"); cards.add("King of clubs");
		cards.add("Ace of spades");  cards.add("Ace of hearts");  cards.add("Ace of diamond");  cards.add("Ace of clubs");
		return cards;
	}
	
}
