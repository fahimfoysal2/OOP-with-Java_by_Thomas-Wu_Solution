/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 2 - Problem L2 P24
 * Print The Middle Character From A Word
 * 
 * @author Fahim Foysal
 */

import java.util.Scanner;

public class L3P28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();	// takes only a word
		scan.close();
		
		int length = word.length();
		
		if(length%2==0) {
			// for even length word, print middle two char
			System.out.println(word.substring(length/2-1, length/2+1));
		}else System.out.println(word.charAt(length/2) );
	}

}
