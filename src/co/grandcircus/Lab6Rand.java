package co.grandcircus;

import java.util.Scanner;

public class Lab6Rand {
	public static void main(String[] args) {

		System.out.println("Welcome to the G.C. Casino!!!");
		Scanner scan = new Scanner(System.in);

		char userQuest = 'y';

		while (userQuest == 'y') {

			System.out.println("How many sides on your two dice do you want to roll with");
			int sidesDie = scan.nextInt();
			System.out.println("You have choosen " + sidesDie);
			System.out.println("Calculating your special random numbers...");
			double randNum = Math.random() * sidesDie;
			double randNum2 = Math.random() * sidesDie;
			int finNum = (int) randNum;
			int finNum2 = (int) randNum2;
			
			System.out.println("The number randomly given to you is..." + finNum + "!!!!!");
			System.out.println("The other random number you obtain is "+finNum2+" woow!!!");
			

			System.out.println("If your interested playing again input y, if not press n");

			userQuest = scan.next().charAt(0);

		}
		scan.close();

	}

}
