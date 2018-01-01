package edu.pragmatic.basicmagic.menuactions;

import edu.pragmatic.basicmagic.Game;

public class ExitGame implements Action {

	@Override
	public String getDescription() {
		return "Еxit Game";
	}

	@Override
	public void performAction(Game game) {
		System.out.println("Bye Bye.");
		game.finishGame();
	}

}
