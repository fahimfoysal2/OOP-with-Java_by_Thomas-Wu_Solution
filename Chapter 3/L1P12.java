/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 2 - Problem L1P12.java
 * Title: BMI Calculator
 * 
 * @author Fahim Foysal
 */

import java.util.Scanner;

public class L1P12 {

	public static void main(String[] args) {
		
		// Initialize
		Scanner scan = new Scanner(System.in);
		int weight, height;
		double h, BMI;
		
		// User Input
		System.out.print("Enter Weight (kg): "); 
		weight = scan.nextInt();
		System.out.print("Enter Height (cm): "); 
		height = scan.nextInt();
		scan.close();
		
		//calculation
		h = height / 100.0;
		BMI = weight/(h*h);
		
		//Output
		System.out.println("\nBMI \t \t: " + BMI);
	}

}
