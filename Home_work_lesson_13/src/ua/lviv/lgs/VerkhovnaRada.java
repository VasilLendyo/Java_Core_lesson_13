package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VerkhovnaRada {

	private static VerkhovnaRada verkhovnaRada;

	public static VerkhovnaRada getInstance() {
		if (verkhovnaRada == null) {
			verkhovnaRada = new VerkhovnaRada();
		}
		return verkhovnaRada;
	}

	List<Faction> faction = new ArrayList<>();

	public List<Faction> getFaction() {
		return faction;
	}

	public void addFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of faction");
		String s = sc.nextLine();

		faction.add(new Faction(s));
	}

	public void removeFaction() {
		System.out.println("Enter name of faction");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		Iterator<Faction> iterator = faction.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().getFactionName().equalsIgnoreCase(s)) {
				iterator.remove();
			}
		}
	}

	public void showAllFaction() {
		Iterator<Faction> iterator = faction.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().getFactionName());
		}
	}

	public void showfaction() {
		System.out.println("Enter name of faction");
		Scanner sc = new Scanner(System.in);
		String nextLine = sc.nextLine();

		Iterator<Faction> iterator = faction.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().getFactionName().equalsIgnoreCase(nextLine)) {
				System.out.println(iterator.next().getDeputy());
			}
		}
	}

	public void addDeputyToFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of faction");
		String s = sc.next().toLowerCase();

		Iterator<Faction> iterator = faction.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().getFactionName().equalsIgnoreCase(s)) {
				iterator.next().addDeputy();
			}
		}
	}

	public void removeDeputyFromFaction() {
		System.out.println("Enter name of faction");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase();

		Iterator<Faction> iterator = faction.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().getFactionName().toLowerCase().equals(s)) {
				iterator.next().removeDeputy();
			}
		}
	}

	public void showAllGraftersFromFaction() {
		System.out.println("Enter name of faction");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		Iterator<Faction> iterator = faction.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().getFactionName().equalsIgnoreCase(s)) {
				iterator.next().AllGraftersFaction();
			}
		}
	}

	public void showBiggestGrafterFromFaction() {
		System.out.println("Enter name of faction");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		Iterator<Faction> iterator = faction.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().getFactionName().equalsIgnoreCase(s)) {
				iterator.next().BiggestGrafterFaction();
			}
		}
	}

	public void showAllDeputyFromFaction() {
		System.out.println("Enter name of faction");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		Iterator<Faction> iterator = faction.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().getFactionName().equalsIgnoreCase(s)) {
				iterator.next().AllDeputyFaction();
			}
		}
	}

	@Override
	public String toString() {
		return "VerkhovnaRada [faction=" + faction + "]";
	}

}
