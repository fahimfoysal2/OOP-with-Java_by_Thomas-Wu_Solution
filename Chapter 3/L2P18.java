/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 2 - Problem L2P18.java
 * Title: Solve Quadratic Equation( ax^2 + bx + c = 0 )  
 * 
 * @author Fahim Foysal
 */

import java.util.Scanner;
import java.lang.Math;

public class L2P18 {

	public static void main(String[] args) {
		double A,B,C;
		double positive_X, negative_X;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Value of A: ");
		A = scan.nextDouble();
		
		System.out.print("Enter Value of B: ");
		B = scan.nextDouble();
		
		System.out.print("Enter Value of C: ");
		C = scan.nextDouble();
		scan.close();
		
		if(A==0) {
			System.out.print("Value of A can not be '0' ");
		}else if(B*B < 4*A*C){
			System.out.println("B^2 >= 4*A*C is not valid");
		}else {
			double calc = Math.sqrt(B*B - 4*A*C);
			
			positive_X = (-B + calc)/(2*A) ;
			negative_X = (-B - calc)/(2*A) ;
			
			System.out.println("Value of X = "+ positive_X + " or " + negative_X );
		}
	}

}
