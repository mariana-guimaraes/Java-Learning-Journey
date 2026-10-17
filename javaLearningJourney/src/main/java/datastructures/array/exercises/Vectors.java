/* 
Data entry optimization for a Hotel:
Employee must type the number of rooms available for the day and the number of rooms that will be booked at that moment.
The program will ask for the rooms number (amongst the quantity number) and the guests info. It compiles and shows all the data at the end.
 */
package main.java.datastructures.array.exercises;
import java.util.Scanner;
import main.java.entities.ClassVectors;
public class Vectors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Total rooms available today: ");
		int roomsAvailable = sc.nextInt();
		ClassVectors[] vect = new ClassVectors[roomsAvailable];

		System.out.print("Rooms to be reservated: ");
		int roomsBooked = sc.nextInt();

		for (int i = 0; i<roomsBooked; i++) {
			System.out.println("Room number:");
			int x = sc.nextInt();					//x = room number = vector position
			if (vect[x-1] == null) {
				System.out.println("Guest name:");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Guest email:");
				String email = sc.nextLine();
				vect[x-1] = new ClassVectors(name, email);
			} else {
				System.out.printf("Room %d not available.%n", x);
				i--;
			}
		}

		System.out.println("Occupied rooms today:");
		for (int i = 0; i < roomsAvailable; i++) {
			if (vect[i] != null) {
				System.out.printf("Room %d: %s, %s.%n", i, vect[i].getName(), vect[i].getEmail());
			}
		}
		sc.close();
	}
}
