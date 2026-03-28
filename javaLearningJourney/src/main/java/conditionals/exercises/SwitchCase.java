/*
Software for teachers:
The program asks the teacher for the students grades (from 0 to 10) on 3 exams, calculates the average and approximates its value.
Then it sends the result to the system, where the student will see it.
*/
package main.java.conditionals.exercises;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Type the result of the 1st exam:");
		double exam01 = sc.nextDouble();
		System.out.println("Type the result of the 2nd exam:");
		double exam02 = sc.nextDouble();
		System.out.println("Type the result of the 3rd exam:");
		double exam03 = sc.nextDouble();

		double average = (exam01 + exam02 + exam03) / 3;
		int rounding = (int) average; // switch-case doesn't read double numbers
		System.out.println("Your total score is: " + rounding);

		if (rounding >= 0 && rounding <= 30) {
			switch (rounding) { //
			case 10, 9:
				System.out.println("Excelent!");
				break;
			case 8, 7:
				System.out.println("Very good!");
				break;
			case 6, 5:
				System.out.println("Aproved.");
				break;
			default:
				System.out.println("Failed.");
			}
		} else {
			System.out.println("Error, total is outside the value range. Type again.");
		}
		sc.close();
	}
}