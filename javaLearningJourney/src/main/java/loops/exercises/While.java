/*
Statistics:
This is for a gas station to understand what customers are buying. The customer types the number related to what was bought and the information is stored. 
At the end of the day, the employee types the password (2026) and sees how many times each product was chosen.
 */
package main.java.loops.exercises;
import java.util.Scanner;
public class While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose one option: 1=Alcohol, 2=Gasoline, 3=Diesel.");
		int number = sc.nextInt();
		int sumAlcohol = 0;
		int sumGasoline = 0;
		int sumDiesel = 0;
		
		while (number!=2026) { //password is 2026
			if(number==1) {
				sumAlcohol ++;
				number = sc.nextInt();
				}
			else if(number==2) {
				sumGasoline ++;
				number = sc.nextInt();
				}
			else if(number==3) {
				sumDiesel ++;
				number = sc.nextInt();
				}
			else { 
				System.out.println("Choose one option: 1=Alcohol, 2=Gasoline, 3=Diesel.");
				number = sc.nextInt();
			}
		}
		
		System.out.println("Results of the day:");
		System.out.println("Alcohol: " + sumAlcohol);
		System.out.println("Gasolina: " + sumGasoline);
		System.out.println("Diesel: " + sumDiesel);
		
		sc.close();
	}
}
