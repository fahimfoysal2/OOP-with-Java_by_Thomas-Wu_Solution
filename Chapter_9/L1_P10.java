package Chapter_9;

import java.util.Scanner;

/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter_9 - Problem L1_P10.java
 * Title: StringBuffer - Sentence Reverse
 * 
 * @author Fahim Foysal
 */

public class L1_P10 {
	public static void main(String[] args) {
		String string;
		StringBuffer sb;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("Input Sentence: ");
			string = scan.nextLine();
			if(!(string.length() > 0)) {
				break;
			}else {
				sb = new StringBuffer(string);
				System.out.println(sb.reverse());
			}
		}
		
		scan.close();

	}
}
