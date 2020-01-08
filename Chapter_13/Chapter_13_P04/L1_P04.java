package Chapter_13_P04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Book: Introduction to OOP with Java - Thomas Wu 
 * Chapter_13 - Problem L1_P04.java 
 * Title: Pet Class
 * 
 * @author Fahim Foysal
 */
public class L1_P04 {
	public static void main(String[] args) {
		ArrayList<Pet> petList = new ArrayList<Pet>();
		Scanner scan = new Scanner(System.in);
		String petName, type;
		Cat myCat;
		Dog myDog;
		System.out.println("Enter Pet Name with Type");
		while (true) {
			petName = scan.next();
			if (petName.equalsIgnoreCase("STOP")) {
				break;
			}
			type = scan.next();
			if (type.equalsIgnoreCase("c")) {
				myCat = new Cat();
				myCat.setName(petName);
				petList.add(myCat);
			} else if (type.equalsIgnoreCase("d")) {
				myDog = new Dog();
				myDog.setName(petName);
				petList.add(myDog);
			}
		}
		scan.close();
		
		for (Pet pet : petList) {
			System.out.print("Pet Name: " + pet.getName());
			if (pet instanceof Dog) {
				System.out.println(" Type : Dog");
			} else {
				System.out.println(" Type : Cat");
			}
		}
	}

}
