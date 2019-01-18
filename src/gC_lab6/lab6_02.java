package gC_lab6;

import java.util.Scanner;
import java.util.Random;

public class lab6_02 {

	public static void main(String[] args) {

		int sidesInput;
		String readyToRoll = "n";
		int rollNumber = 1;

		System.out.println("Welcome to the Grand Circus (fake) Casino.");
		System.out.println("\n");

		System.out.println("How many sides should each die have ?");
		Scanner scnr = new Scanner(System.in);
		sidesInput = scnr.nextInt();

		System.out.println("Ready to roll? (Y or N)");

		readyToRoll = scnr.next();

		while (readyToRoll.equalsIgnoreCase("y")) {

			System.out.println("\n");

			System.out.println("Roll " + rollNumber + ":");
			int dieOne = (generateRandomDieRoll(sidesInput));
			int dieTwo = (generateRandomDieRoll(sidesInput));
			System.out.println(dieOne);
			System.out.println(dieTwo);
			System.out.println("\n");
			rollNumber++;

			if (dieOne == 6 && dieTwo == 6) {
				System.out.println("OMG BOXCARS!");
				System.out.println("\n");
			}
			if (dieOne == 1 && dieTwo == 1) {
				System.out.println("CAUTION SNAKE SIGHTING!");
				System.out.println("\n");

			}
			if ((dieOne + dieTwo == 12) || (dieOne + dieTwo == 3) || (dieOne + dieTwo == 2)) {
				System.out.println("CRAP");
				System.out.println("\n");
			}
			System.out.println("Do you want to roll again? (Y/N)");
			readyToRoll = scnr.next();
		}

		System.out.println("See you l8er!");

		scnr.close();
	}

	private static int generateRandomDieRoll(int dieSides) {
		Random rand = new Random();
		return (rand.nextInt(dieSides + 1) + 1);
	}
}
