import java.util.Scanner;

/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 5 - Problem L2 P12.java
 * Title: Leap Year
 * 
 * @author Fahim Foysal
 */
public class Chap5_L2_P12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		scan.close();
		
		if(year%4 == 0) {
			if(year%100 == 0 && year%400 == 0) {
				System.out.println("It's a Leap Year");
			}else {
				System.out.println("It's not a Leap Year");
			}
		}else {
			System.out.println("It's not a Leap Year");
		}

	}

}
