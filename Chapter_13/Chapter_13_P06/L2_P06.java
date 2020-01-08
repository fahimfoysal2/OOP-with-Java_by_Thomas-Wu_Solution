package Chapter_13_P06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter_13_P06 - Problem L2_P06.java
 * Title: 
 * 
 * @author Fahim Foysal
 */
public class L2_P06 {

	public static void main(String[] args) {
		ArrayList<Pet> petList = new ArrayList<Pet>();
		Scanner scan = new Scanner(System.in);
		String petName, type;
		Cat myCat;
		Dog myDog;
		while(true){
			System.out.println("Enter Pet Name with Type");
			petName = scan.next();
			if(petName.equalsIgnoreCase("STOP")){
				break;
			}
			type = scan.next();
			if(type.equalsIgnoreCase("c")){
				myCat = new Cat();
				myCat.setName(petName);
				System.out.println("Enter Cat Color :");
				myCat.setColor(scan.next());
				petList.add(myCat);
			} else if(type.equalsIgnoreCase("d")){
				myDog = new Dog();
				myDog.setName(petName);
				System.out.println("Enter Dog Weight :");
				myDog.setWeight(scan.nextDouble());
				petList.add(myDog);
			}
		}
		scan.close();
		for(Pet pet : petList){
			System.out.print("Pet Name: " + pet.getName());
			if(pet instanceof Dog){
				Dog dog = (Dog)pet;
				System.out.println(" Type : Dog, Weight: "+ dog.getWeight());
			} else{
				Cat cat = (Cat)pet;
				System.out.println(" Type : Cat, Cat Color : " + cat.getColor());
			}
		}
	}

}
