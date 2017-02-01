package oop2;

import java.util.Scanner; //for input number

/**
 * Game of guessing a secret number.
 * 
 * @author Wongsathorn Paichkurkul
 */

public class GameConsole {
	/**
	 * The player method plays a game using input from a user
	 * 
	 * @param game is the object of GuessingGame
	 * @return the correct number
	 */
	public int play(GuessingGame game) {

		Scanner input = new Scanner(System.in);
		String title = "Guessing Game";
		String prompt = "Your guess? ";
		System.out.print(title + "\n" + game.getHint() + "\n" + prompt);
		int userRandom = input.nextInt();
		
		while (game.guess(UserRandom) == false) {
			System.out.print(game.getHint()+"\n" + prompt);
			UserRandom = input.nextInt();
		}
		
		System.out.println("You used " + game.getCount() + " guesses.");
		return UserRandom;

	}
}
