package edu.pragmatic.basicmagic.menuactions;

import edu.pragmatic.basicmagic.Game;

public interface Action {
	
	String getDescription();
	
	 void performAction(Game game);

}
