package ua.lviv.lgs;

import java.util.Scanner;

public class Deputy extends Person {

	private String lastName;
	private String name;
	private int age;
	private boolean grafter;
	private int sizeOfBribe;

	public Deputy(int weight, int height, String lastName, String name, int age, boolean grafter) {
		super(weight, height);
		this.lastName = lastName;
		this.name = name;
		this.age = age;
		this.grafter = grafter;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGrafter() {
		return grafter;
	}

	public void setGrafter(boolean grafter) {
		this.grafter = grafter;
	}

	public int getSizeOfBribe() {
		return sizeOfBribe;
	}

	public void setSizeOfBribe(int sizeOfBribe) {
		this.sizeOfBribe = sizeOfBribe;
	}

	@Override
	public String toString() {
		return "Deputy [lastName=" + lastName + ", name=" + name + ", age=" + age + ", grafter=" + grafter
				+ ", sizeOfBribe=" + sizeOfBribe + "]";
	}

	public void giveBribe() {
		if (!grafter) {
			System.out.println("This depudy does not take bribes");
		} else {
			System.out.println("Enter the bribe amount: ");
			Scanner sc = new Scanner(System.in);
			int nextInt = sc.nextInt();
			if (nextInt > 5000) {
				System.out.println("The police detain the deputy");
			} else {
				sizeOfBribe = nextInt;
			}
		}
	}
}
