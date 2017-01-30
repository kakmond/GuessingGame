package oop2;

import java.util.Random; // for random numbers

/**
 * Game of guessing a secret number.
 * 
 * @author Wongsathorn Paichkurkul
 */

public class GuessingGame {
	/* properties of a guessing game */
	private int upperBound;
	private int secret;
	private String hint;
	private int count;

	/**
	 * Initialize a new game.
	 * 
	 * @param upperbound is the max value for the secret number (>1).
	 */
	public GuessingGame(int upperBound) // this is a constructor
	{
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		this.hint = "I'm thinking of a number between 1 and " + upperBound + ".";
	}

	/**
	 * check input number equal random number or not
	 * 
	 * @param number is the number that user input
	 * @return true if input number equal the random number, false if input number not equal the random number
	 */
	public boolean guess(int number) {
		
		count++; //increase count number of trying
		
		if (secret == number) {
			System.out.println("Correct. The secret is " + number + ".");
			return true;
		} else {
			if (number > secret) {
				setHint("Sorry, you're guess is too large.");
			} else if (number < secret) {
				setHint("Sorry, your guess is too small.");
			}
			
			return false;
		}

	}

	/**
	 * Return a hint based on the most recent guess.
	 * 
	 * @return hint based on most recent guess
	 */
	public String getHint() {
		return this.hint;
	}

	/**
	 * set the text of hint
	 * 
	 * @param hint is the text that you want to change
	 */
	protected void setHint(String hint) {
		this.hint = hint;
	}

	/**
	 * Create a random number between 1 and limit.
	 * 
	 * @param limit is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */
	private int getRandomNumber(int limit) {
		long seed = System.currentTimeMillis();
		Random random = new Random(seed);
		return random.nextInt(limit) + 1;
	}

	/**
	 * get the number of trying
	 * 
	 * @return the number of trying
	 */
	public int getCount() {
		return this.count;
	}

}
