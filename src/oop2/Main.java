package oop2;

/**
 * Game of guessing a secret number.
 * 
 * @author Wongsathorn Paichkurkul
 */

public class Main {

	/** create objects and start the game */
	public static void main(String[] args) {
		GuessingGame game = new GuessingGame(5);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}

}
