/*
Program for a movie theater ticketing system:
This theater has 6 rows (lines) and 8 seats per row (columns). All free seats will be displayed with an F (free), and the customer will be asked which place they want. 
This place then changes from F to X (taken). If the seat is already taken, a warning message is displayed.
*/
package main.java.datastructures.array.exercises;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[][] theater = new char[6][8];

		for (int r = 0; r < 6; r++) {
			for (int s = 0; s < 8; s++) {
				theater[r][s] = 'F';
			}
		}

		String option = "Y";
		int row;
		int seat;

		do {
			System.out.println("WELCOME TO CUSTOMER AREA");
			System.out.println("Available places:");
			System.out.print("  ");

			for (int s = 0; s < 8; s++) {
				System.out.print(" " + (s + 1));
			}
			System.out.println();
			for (int r = 0; r < 6; r++) {
				System.out.print((r + 1) + "- ");
				for (int s = 0; s < 8; s++) {
					System.out.print(theater[r][s] + " ");
				}
				System.out.println();
			}

			do {
				System.out.println("a) Type the number of a valid row:");
				row = sc.nextInt();
			} while (row > 6 || row < 1);

			do {
				System.out.println("b) Type the number of a valid seat:");
				seat = sc.nextInt();
			} while (seat > 8 || seat < 1);

			if (theater[row - 1][seat - 1] == 'X') {
				System.out.println("This place is taken.");
			} else if (theater[row - 1][seat - 1] == 'F') {
				theater[row - 1][seat - 1] = 'X';
				System.out.println("Reservation completed.");
			}

			System.out.println("Would you like to make another reservation? (Y/N)");
			option = sc.next();

		} while (option.equalsIgnoreCase("Y"));

		System.out.println("Thank you!");
		sc.close();
	}
}