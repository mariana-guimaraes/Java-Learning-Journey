/*
Programming for business:
The program will ask for the amount of employees to be registered in the company, and their data. All the information will then be showed.
Later, its possible to choose one employee to increase their salary as long as the typed ID exists. All the information is displayed again.
 */
package main.java.datastructures.list.exercises;
import java.util.Scanner;
import main.java.entities.ClassLists;
import java.util.List;
import java.util.ArrayList;
public class Lists {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<ClassLists> list = new ArrayList<>();

		System.out.print("How many people will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			list.add(new ClassLists(name, id, salary));
		}

		System.out.println("List of employees:");
		for (ClassLists obj : list) {
			System.out.println(obj);
		}
		
		System.out.print("Enter the employee ID whose salary will increase: ");
		ClassLists employee = null;
		while (employee == null) {
		    System.out.print("Enter the employee ID: ");
		    int id = sc.nextInt();
		    employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		    if (employee == null) {
		        System.out.println("This ID does not exist. Try again.");
		    }
		}
		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		employee.raise(percentage);

		System.out.println();
		System.out.println("List of employees:");
		for (ClassLists obj : list) {
		    System.out.println(obj);
		}
		sc.close();
	}

	// methods
	public static boolean idPosition(List<ClassLists> list, int id) {
		ClassLists employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return employee != null;
	}
}
