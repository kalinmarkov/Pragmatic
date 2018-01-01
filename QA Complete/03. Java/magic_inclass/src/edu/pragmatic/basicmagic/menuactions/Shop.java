package edu.pragmatic.basicmagic.menuactions;

import edu.pragmatic.basicmagic.Game;

public class Shop implements Action{

	@Override
	public String getDescription() {
		return "Buy from the store.";
	}

	@Override
	public void performAction(Game game) {
		System.out.println("Welcome to the Shop!");
	}

}
