/*
Practical program for price tags:
Made for a store that sells either common, used or imported electronics.
The employee must type the data of each product, considering some have specific characteristics, and the price tags will be generated.
 */
package main.java.oop.exercises;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import main.java.entities.ImportedProduct;
import main.java.entities.Product;
import main.java.entities.UsedProduct;

public class Inheritance {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		System.out.print("Type the amount of products: ");
		int n = sc.nextInt();
		
		for (int i=0; i<=n; i++) {
			System.out.println("Data of product number " + (i+1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			System.out.print("Common, used or imported product (c/u/i)? ");
			char type = sc.next().charAt(0);
			
			if (type == 'c') {
				list.add(new Product(name, price));
			}
			else if (type == 'u') {
				System.out.print("Type fabrication date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			}
			else if (type == 'i') {
				System.out.print("Importation fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			else {
				System.out.print("Try again.");
				i--;
			}
		}

		System.out.println();
		System.out.println("Price tags:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}
}