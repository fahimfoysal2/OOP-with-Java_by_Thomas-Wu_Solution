/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 2 - Problem L3P24.java
 * Title: 
 * 
 * @author Fahim Foysal
 */
import java.text.*;
import java.util.Scanner;
public class L3P24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000"); 
		
		System.out.print( "Enter Number of bags sold: ");
		int bag = scan.nextInt();
		System.out.print( "     Enter Weight per bag: ");
		int weight = scan.nextInt();
		double perPound = 5.99;
		double tax		= 7.25;
		scan.close();
		
		double totalPrice = bag*weight*perPound;
		double withTax	  = totalPrice + totalPrice*(tax/100);
		
		System.out.flush();
		System.out.println( "Number of bags sold: "+bag);
		System.out.println( "     Weight per bag: "+weight+"lb");
		System.out.println( "    Price per pound: $"+perPound);
		System.out.println( "          Sales tax: "+tax+"%\n");
		System.out.println( "        Total Price: $ "+df.format(withTax));
	}
}
