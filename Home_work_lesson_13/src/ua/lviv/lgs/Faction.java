package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Faction {

	private String factionName;
	List<Deputy> deputy = new ArrayList<>();

	public Faction(String factionName) {
		super();
		this.factionName = factionName;
	}

	public String getFactionName() {
		return factionName;
	}

	public void setFactionNama(String factionName) {
		this.factionName = factionName;
	}

	public List<Deputy> getDeputy() {
		return deputy;
	}

	public void setDeputy(List<Deputy> deputy) {
		this.deputy = deputy;
	}

	@Override
	public String toString() {
		return "Faction [factionName=" + factionName + ", deputy=" + deputy + "]";
	}

	public void addDeputy() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight: ");
		int weight = sc.nextInt();
		System.out.println("Enter height: ");
		int height = sc.nextInt();
		System.out.println("Enter lastname: ");
		String lastName = sc.next();
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Enter if grafter: ");
		boolean grafter = sc.hasNextBoolean();

		deputy.add(new Deputy(weight, height, lastName, name, age, grafter));
	}

	public void removeDeputy() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter last name of deputy");
		String s = sc.next().toLowerCase();

		Iterator<Deputy> iterator = deputy.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().getLastName().toLowerCase().equals(s)) {
				iterator.remove();
				System.out.println("Removed");
			}
		}
	}

	public void AllGraftersFaction() {
		Iterator<Deputy> iterator = deputy.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().isGrafter()) {
				System.out.println(iterator.next());
			}
		}
	}

	public void BiggestGrafterFaction() {
		Collections.max(deputy, new DeputySizeOfBribeComparator());
	}

	public void AllDeputyFaction() {
		for (Deputy deputy2 : deputy) {
			System.out.println(deputy2);
		}
	}

	public void clearAllFromFaction() {
		deputy.clear();
		System.out.println("Cleaned");
	}

}
