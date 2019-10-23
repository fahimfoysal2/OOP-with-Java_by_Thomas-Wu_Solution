import java.util.Scanner;

/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 5 - Problem L1_P9.java
 * Title: Power of 10
 * 
 * @author Fahim Foysal
 */

public class Chap5_L1_P9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter power of 10: ");
		int power = scan.nextInt();
		scan.close();
		
		switch (power) {
		case 6 : System.out.print(">> It's a Million");
				 break;
		case 9 : System.out.print(">> It's a Billion");
				 break;
		case 12: System.out.print(">> It's a Trillion");
				 break;
		case 15: System.out.print(">> It's a Quantillion");
				 break;
		case 18: System.out.print(">> It's a Quadrillion");
				 break;
		case 21: System.out.print(">> It's a Sextillion");
				 break;
		case 30: System.out.print(">> It's a Nonillion");
				 break;
		case 100:System.out.print(">> It's a Googol");
				 break;
		default:
			System.out.print(">> Unexpected value!\n"
					+ "No definition found for power " + power);
		}
	}
}
