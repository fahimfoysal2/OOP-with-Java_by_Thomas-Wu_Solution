/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 4 - Problem 6.java
 * Title: Total of 3 types ticket sale.
 * 
 * @author Fahim Foysal
 */
package p6_ticketSales;
import java.util.Scanner;

public class ticketSales {
	public static void main(String[] args) {
		double aPrice, bPrice, cPrice;
		int    aSold, bSold, cSold;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\tEnter Price List\n\t----------------\n");
		System.out.print("Price Per A type seat  : ");
		aPrice = scan.nextDouble();
		System.out.print("Price Per B type seat  : ");
		bPrice = scan.nextDouble();
		System.out.print("Price Per C type seat  : ");
		cPrice = scan.nextDouble();
		
		System.out.print("\n\tEnter Sales List\n\t----------------\n");
		System.out.print("Num of sold A type seat: ");
		aSold = scan.nextInt();
		System.out.print("Num of sold B type seat: ");
		bSold = scan.nextInt();
		System.out.print("Num of sold C type seat: ");
		cSold = scan.nextInt();
		scan.close();
		System.out.println("\nTotal Sold             : "+
					(aPrice*aSold + bPrice*bSold + cPrice*cSold) );
	}

}
