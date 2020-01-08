package Chapter_13_P13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter_13_P13 - Problem L3_P13.java
 * Title: Pet Directory
 * 
 * @author Fahim Foysal
 */
public class L3_P13 {
	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		ArrayList<Cat> catList = new ArrayList<Cat>();
		Scanner scan = new Scanner(System.in);
		String petName, type;
		Cat myCat;
		Dog myDog;
		System.out.println("Enter Menu Choice");
		int choice;
		while (true) {
			System.out.println("1. Add Cat");
			System.out.println("2. Add Dog");
			System.out.println("3. Remove Cat");
			System.out.println("4. Remove Dog");
			System.out.println("0. Quit");
			choice = scan.nextInt();
			if (choice == 0) {
				break;
			} else if (choice == 1) {
				petName = scan.next();
				myCat = new Cat();
				myCat.setName(petName);
				System.out.println("Enter Cat Color :");
				myCat.setColor(scan.next());
				catList.add(myCat);
			} else if (choice == 2) {
				petName = scan.next();
				myDog = new Dog();
				myDog.setName(petName);
				System.out.println("Enter Dog Weight :");
				myDog.setWeight(scan.nextDouble());
				dogList.add(myDog);
			} else if (choice == 3) {
				petName = scan.next();
				for (Cat cat : catList) {
					if (cat.getName().equalsIgnoreCase(petName)) {
						catList.remove(cat);
						System.out.println("Removed cat !");
						break;
					}
				}
			} else if (choice == 4) {
				petName = scan.next();
				for (Dog dog : dogList) {
					if (dog.getName().equalsIgnoreCase(petName)) {
						dogList.remove(dog);
						System.out.println("Removed dog!");
						break;
					}
				}
			}
		}
	}
}
