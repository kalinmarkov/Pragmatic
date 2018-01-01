package edu.pragmatic.basicmagic;

import java.util.Scanner;

import edu.pragmatic.basicmagic.gamecharacters.Magus;
import edu.pragmatic.basicmagic.menuactions.Action;
import edu.pragmatic.basicmagic.menuactions.ExitGame;
import edu.pragmatic.basicmagic.menuactions.Move;
import edu.pragmatic.basicmagic.menuactions.PrintInfo;
import edu.pragmatic.basicmagic.menuactions.PrintMapNoCurrentLocation;
import edu.pragmatic.basicmagic.menuactions.PrintMapWithCurrentLocation;
import edu.pragmatic.basicmagic.menuactions.Shop;

public class RpgGame implements Game {
	
	private Action[] actions ;
	private Boolean isFinishGame;
	
	public void finishGame() {
		isFinishGame = true;
	}
	
	public RpgGame() {
		actions = new Action[] {
				new ExitGame(),
				new PrintMapNoCurrentLocation(),
				new PrintMapWithCurrentLocation(),
				new Shop(),
				new Move(),
				new PrintInfo(),
		}; 
		isFinishGame = false;
	}
	
	private Magus magus;
	
	@Override
	public Magus getMagus() {
		return magus;
	}
	
	public void startGame() {
		Scanner console = new Scanner(System.in);
		createMagus(console);
		while (!isFinishGame) {
			showMenu(console);
		}
	}

	private void createMagus(Scanner console) {
		System.out.println("Please enter magus' name.");
		String name = console.nextLine();
		magus = new Magus(name, 100, 15, 5);
	}

	private void showMenu(Scanner console) {
		for (int i = 0; i < actions.length; i++) {
			Action action = actions[i];
			System.out.printf("%d. %s\n", i + 1, 
					action.getDescription());
		}
		
		String input = console.nextLine();
		int option = Integer.valueOf(input);
		Action action = actions[option - 1];
		action.performAction(this);
	}

	public static void main(String[] args) {
		RpgGame game = new RpgGame();
		game.startGame();
	}

}
