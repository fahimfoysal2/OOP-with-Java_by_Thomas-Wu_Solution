package Chapter_9;

import java.util.Scanner;

/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 9 - Problem L1_P09.java
 * Title: String -> ASCII char ~ value
 * 
 * @author Fahim Foysal
 */

public class L1_P09 {
	public static void main(String[] args) {
		String character;
		int ASCII;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter A character: ");
			character = scan.next();
			
			if(character.length()>1) {
				System.out.println("Error! Only one character Allowed.");
			}else {
				ASCII = character.charAt(0);
				if(ASCII==64) {
					break;
				}else {
					System.out.println(ASCII);
				}
			}
		}
		scan.close();
	}
}
