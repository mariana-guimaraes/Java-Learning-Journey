/*
 Playlist program for a music app:
 It will be possible to choose the playlist size, add new songs, check out the playlist, remove songs and see the first or last song.
 */
package main.java.datastructures.list.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Lists2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Type the amount of songs this playlist will have:");
		int amount = sc.nextInt();

		ArrayList<String> playlist = new ArrayList<>(amount);

		for (int i = 0; i < amount; i++) {
			System.out.println("Add a song by typing its name:");
			String song = sc.next();
			if (playlist.contains(song)) {
				System.out.println("This song is already on the playlist.");
				i--;
			} else {
				playlist.add(song);
				System.out.println("Song successfully added.");
			}
		}

		int option = 0;
		while (option != 5) {
			System.out.println("\n--- PLAYLIST MENU ---");
			System.out.println("1 - Show playlist");
			System.out.println("2 - Remove a song");
			System.out.println("3 - Show playlist size");
			System.out.println("4 - First song / Last song");
			System.out.println("5 - Exit");
			System.out.println("Choose an option:");

			option = sc.nextInt();

			switch (option) {
			case 1 -> {
				System.out.println("\nYour playlist:");
				for (int i = 0; i < playlist.size(); i++) {
					System.out.println((i + 1) + ". " + playlist.get(i));
				}
			}
			case 2 -> {
				System.out.println("\nRemove a song by typing its name:");
				String song = sc.next();
				if (playlist.remove(song)) {
					System.out.println("Song successfully removed.");
				} else {
					System.out.println("Song not found.");
				}
			}
			case 3 -> {
				System.out.println("\nPlaylist size:");
				System.out.println(playlist.size());
			}
			case 4 -> {
				if (!playlist.isEmpty()) {
					System.out.println("\nFirst song:");
					System.out.println(playlist.get(0));
					System.out.println("Last song:");
					System.out.println(playlist.get(playlist.size() - 1));
				} else {
					System.out.println("The playlist is empty.");
				}
			}
			case 5 -> System.out.println("Exiting...");
			default -> System.out.println("Invalid option.");
			}
		}
		sc.close();
	}
}
