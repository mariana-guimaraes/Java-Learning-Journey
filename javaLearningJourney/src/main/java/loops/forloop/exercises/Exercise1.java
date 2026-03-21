package main.java.loops.forloop.exercises;

/*
Times table for kids:
A simple program to facilitate learning. A student types a positive number and the program shows the times table for that number.
*/

import java.util.Scanner;
public class Exercise1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Type a number:");
		int number = scanner.nextInt();
		
		if(number>=0) {
		System.out.printf("Times table for %d is:%n" , number);
		for(int i=0; i<=number; i++) {
			int result = i*number;
			System.out.printf("%d * %d = %d%n", i, number, result);
		}
		}
		else {
			System.out.println("Please type a positive number.");
		}
		
		scanner.close();
	}
}