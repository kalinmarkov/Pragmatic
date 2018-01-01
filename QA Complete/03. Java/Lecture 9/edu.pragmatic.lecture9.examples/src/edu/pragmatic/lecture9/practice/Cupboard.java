package edu.pragmatic.lecture9.practice;

import java.util.ArrayList;
import java.util.List;

public class Cupboard<T extends Socks> {
	
	private List<Object> items ; 

	public void addItem(Object item) {
		items.add(item);
	}
	
	public static <D> void size(D cupboard) {
		
	}
	
	public static void main(String[] args) {
		Cupboard<Socks> words = new Cupboard<>();
		words.items = new ArrayList<>();
		words.addItem(new ShortSocks());
		
	}
}
