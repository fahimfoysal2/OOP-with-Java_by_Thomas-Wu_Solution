/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 6 - Problem 27
 * Title: Evaluate sinx, cosx calculation
 * 
 * @author Fahim Foysal
 */
package Chap6_L3_P27;

import java.util.Scanner;

public class trigonoMain {

	public static void main(String[] args) {
		int x;
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		scan.close();
		
		double sinRes = Math.sin(x) ;
		double cosRes = Math.cos(x);
		
		System.out.format("Sine Value = %f\nCos  Value = %f\n", sinRes,cosRes);
		
		ManualTrigonomitry mt = new ManualTrigonomitry(x);
		
		System.out.print( mt.sine() );
		
	}
}
