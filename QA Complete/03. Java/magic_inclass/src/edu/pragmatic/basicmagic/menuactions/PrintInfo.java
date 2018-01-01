package edu.pragmatic.basicmagic.menuactions;

import edu.pragmatic.basicmagic.Game;

public class PrintInfo implements Action {

	@Override
	public String getDescription() {
		return "Print current magus info";
	}

	@Override
	public void performAction(Game game) {
		System.out.println(game.getMagus());
	}

}
