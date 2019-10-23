/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 5 - Problem level 2 problem 15
 * Title: perimeter and area of a triangle.
 * 
 * @author Fahim Foysal
 */
package Chap5_L2_P15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class c5l2p15 {
	public static void main(String[] args) {
		double a,b,c;
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Left side      : ");
		a = scan.nextDouble();
		System.out.print("Enter Base           : ");
		b = scan.nextDouble();
		System.out.print("Enter Right side     : ");
		c = scan.nextDouble();
		scan.close();
		
		Triangle triag = new Triangle(a, b, c);
		
		System.out.println("Area of the Triangle : "+ df.format(triag.getArea()));
		System.out.println("Area of the Triangle : "+ df.format(triag.getPerimeter()));
		
		
	}
}
