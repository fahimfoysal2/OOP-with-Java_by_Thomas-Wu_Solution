package Chapter_13_P05;

import java.util.ArrayList;
import java.util.Scanner;
import Chapter_13_P04.*;
/**
 * Book: Introduction to OOP with Java - Thomas Wu 
 * Chapter_13_P05 - Problem L1_P05.java 
 * Title: Pet Class - v2
 * 
 * @author Fahim Foysal
 */
public class L1_P05 {
	public static void main(String[] args) {
		ArrayList<Cat> catList = new ArrayList<Cat>();
		ArrayList<Dog> dogList = new ArrayList<Dog>();
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
				catList.add(myCat);
			} else if (type.equalsIgnoreCase("d")) {
				myDog = new Dog();
				myDog.setName(petName);
				dogList.add(myDog);
			}
		}
		scan.close();
		
		System.out.println("Name of all Cats :");
		for (Cat cat : catList) {
			System.out.println(cat.getName());
		}
		System.out.println("Name of all Dogs :");
		for (Dog dog : dogList) {
			System.out.println(dog.getName());
		}
	}
}
