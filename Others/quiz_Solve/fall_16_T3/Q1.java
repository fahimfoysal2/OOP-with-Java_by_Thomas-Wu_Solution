/**
 *Problem:-
 * Count Number of vowels from an input string
 * 
 * @author Fahim Foysal
 */
package fall_16_T3;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		String string;
		System.out.print("Input String: ");
		Scanner scan = new Scanner(System.in);
		string = scan.nextLine();
		scan.close();

		string = string.toUpperCase();
		char x;
		int vowelCount = 0;

		for (int i = 0; i < string.length(); i++) {
			x = string.charAt(i);
			if (x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
				vowelCount++;
			}
		}
		
		System.out.println("Number of vowels: "+ vowelCount);
	}
}
