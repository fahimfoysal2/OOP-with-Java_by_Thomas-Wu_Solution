/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 5 - Problem L3 P17
 * Title: Convert year to Roman numerals
 * 
 * @author Fahim Foysal
 */
package Chap5_L3_P17;

import java.util.Scanner;

public class toRoman {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Romans[] array = Romans.values();
		int year;
		
		System.out.print("Enter Year   : ");
		year = scan.nextInt();
		scan.close();
		
		System.out.print("Year in Roman: ");
		for(Romans ri : array) {
			int printer = year/ri.value();
			year = year%ri.value();
			while(printer>0) {
				System.out.print(ri);
				printer--;
			}
		}
	}
}
