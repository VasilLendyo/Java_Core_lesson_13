package ua.lviv.lgs;

import java.io.ObjectInputStream.GetField;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		VerkhovnaRada rada = VerkhovnaRada.getInstance();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			menu();
			String next = scanner.next();
			switch (next) {
			case "1": {
				rada.addFaction();
				System.out.println("added");
				break;
			}
			case "2": {
				rada.removeFaction();
				System.out.println("removed");
				break;
			}
			case "3": {
				rada.showAllFaction();
				break;
			}
			case "4": {

				String nextLine = scanner.next();
				System.out.println("Enter name of faction");
				Iterator<Faction> iterator = rada.faction.iterator();
				Faction next2 = iterator.next();

				while (iterator.hasNext()) {
					if (next2.getFactionName().equalsIgnoreCase(nextLine)) {
						iterator.next().clearAllFromFaction();
					}
				}
				break;
			}
			case "5": {
				rada.showfaction();
				break;
			}
			case "6": {
				rada.addDeputyToFaction();
				System.out.println("added");
				break;
			}
			case "7": {
				rada.removeDeputyFromFaction();
				break;
			}
			case "8": {
				rada.showAllGraftersFromFaction();
				break;
			}
			case "9": {
				rada.showBiggestGrafterFromFaction();
				break;
			}
			}
		}
	}

	public static void menu() {
		System.out.println();
		System.out.println("Enter 1, to add a faction");
		System.out.println("Enter 2, to remove a faction");
		System.out.println("Enter 3, to print all factions");
		System.out.println("Enter 4, to clear a faction");
		System.out.println("Enter 5, to print a faction");
		System.out.println("Enter 6, to add deputy to faction");
		System.out.println("Enter 7, to remove deputy from faction");
		System.out.println("Enter 8, to print all grafters");
		System.out.println("Enter 9, to print the biggest grafter");
		System.out.println();
	}
}
