/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 2 - Problem L1P14.java
 * Title: Calculate Compound Interest 
 * 
 * @author Fahim Foysal
 */

import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;

public class L1P13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int invest, year;
		double rate, total;
		
		System.out.print("Invest Amount: ");
		invest = scan.nextInt();
		
		System.out.print("Year\t     : ");
		year = scan.nextInt();
		
		System.out.print("Interest Rate: ");
		rate = scan.nextDouble();
		scan.close();
		
		rate = Math.pow((1+rate/100),year);
		total = invest * rate;
		
		System.out.println("\nYou'll get   : "+df.format(total));
	}

}
