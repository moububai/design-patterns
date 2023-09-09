package Golf;

import java.util.Scanner;

/*
 * Golfer Driver that uses the Golfer, HoleScoreDisplay, RoundScoreDisplay, Subject, and Observer class
 * 
 * Subjects:
 * 	Golfer: Has a stroke and par for each hole that is updated
 * Observers:
 *  HoleScoreDisplay: Displays the current par and strokes for one hole
 *  RoundScoreDisplay: Displays the total par  and strokes for all current holes
 * 
 * @author Portia PLante, Javadoc: Cameron Reyes
 * @version 1.0 build Sept 9, 2023
 */

public class GolfDriver {
	private Scanner scanner;
	private Golfer golfer;
	private Observer holeScoreDisplay;
	private Observer roundScoreDisplay;

	/*
	 * Initializes the Scanner to be used throughout this driver
	 */
	public GolfDriver() {
		scanner = new Scanner(System.in);
	}

	/*
	 * Creates the golfer, holeScoreDisplay, roundScoreDisplay and comes with a prerecorded array of pars(length 9)
	 * 
	 * Ask for user to input the Golfers name, then for each hole it ask the user for the number of strokes the Golfer took.
	 * The number of strokes and pars for that hole are then entered into the golfer subject and fed to the holeScoreDisplay
	 * and roundScoreDisplay. After this, it ask the user for the viewstats() command and runs through nine holes.
	 */
	public void run() {
		int[] pars = { 3, 4, 2, 2, 3, 4, 2, 3, 4 };
		clear();
		System.out.print("Enter Golfers Name: ");
		String golferName = scanner.nextLine().trim();

		golfer = new Golfer(golferName);
		holeScoreDisplay = new HoleScoreDisplay(golfer);
		roundScoreDisplay = new RoundScoreDisplay(golfer);

		System.out.println(golfer.getName() + " is playing golf");

		for (int i = 0; i < pars.length; i++) {
			System.out.println("\n*** Hole " + (i + 1) + " ***");
			System.out.print("Number of Strokes: ");
			int numStrokes = Integer.parseInt(scanner.nextLine().trim());
			golfer.enterScore(numStrokes, pars[i]);
			viewStats();
		}

		System.out.println("We hope you enjoyed your round of golf " + golfer.getName() + ", have a good day");
	}

	/*
	 * Allows the user to enter a number between 1 to 4, between each hole
	 * 
	 * Command "1": calls holeScoreDisplay
	 * Command "2": calls roundScoreDisplay
	 * Command "3": calls roundScoreDisplay and holeScoreDisplay
	 * Command "4": continues to next hole
	 * other commands: invalid and repeates viewStats()
	 */

	private void viewStats() {
		while (true) {
			System.out.print("1. View Hole Stats, 2. View Round Stats, 3. View Both Stats, 4. Continue: ");
			int command = Integer.parseInt(scanner.nextLine().trim());
			if (command == 4) {
				return;
			}
			if (command == 1) {
				System.out.println(holeScoreDisplay);
				break;
			} else if (command == 2) {
				System.out.println(roundScoreDisplay);
				break;
			} else if (command == 3) {
				System.out.println(holeScoreDisplay);
				System.out.println(roundScoreDisplay);
				break;
			} else {
				System.out.println("Sorry, that's not a valid input option.");
			}
		}
	}

	/*
	 * Clears the terminal 
	 */

	private void clear() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	/*
	 * Calls for the program to run when code is runned
	 */

	public static void main(String[] args) {
		GolfDriver driver = new GolfDriver();
		driver.run();
	}
}
