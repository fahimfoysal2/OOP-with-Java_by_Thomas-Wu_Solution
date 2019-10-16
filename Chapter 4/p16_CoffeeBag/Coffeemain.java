/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 4 - Problem 16.java
 * Title: Coffee Bag Sale
 * 
 * @author Fahim Foysal
 */
package p16_CoffeeBag;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Coffeemain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print( "Enter Number of bags sold: ");
		int bag = scan.nextInt();
		System.out.print( "     Enter Weight per bag: ");
		int weight = scan.nextInt();
		scan.close();
		
		CoffeeBag cofee = new CoffeeBag();
		cofee.CalculatePrice(bag, weight);
		
		System.out.flush();
		System.out.println( "Number of bags sold: "+bag);
		System.out.println( "     Weight per bag: "+weight+"lb");
		System.out.println( "    Price per pound: $"+cofee.getPricePerPound());
		System.out.println( "          Sales tax: "+cofee.getTaxRate()+"%\n");
		System.out.println( "        Total Price: $ "+df.format(cofee.getPrice()));
	}

}
