/*
Financial math and tax calculations:
The program will read a users salary and then display how much will be deducted in taxes from that salary. 
Taxes are calculated according to this definition:
up to $2000: none
$2000.01 to $3000: 8%
above $3000: 28%
*/
package main.java.conditionals.exercises;
import java.util.Scanner;
public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Type your salary:");
		double salary = sc.nextDouble();
		double taxes;

		if (salary <= 2000) {
			taxes = 0; // up to $2000 taxes=0
		} 
		else if (salary <= 3000) {
			taxes = (salary-2000)*0.08; // $2000 to $3000 taxes=8%
		} 
		else {
			taxes = 1000*0.08 + (salary-3000)*0.18; // $2000 to $3000 taxes=8%, over $3000 taxes=18%
		}

		if (taxes == 0.0) {
			System.out.println("No taxes.");
		} 
		else {
			System.out.printf("$%.2f to be reduced in taxes.%n", taxes);
		}

		sc.close();
	}
}