package Chapter_9;
import java.util.Scanner;

/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter_9 - Problem L3_P24.java
 * Title: Palindrome Sentence
 * 
 * @author Fahim Foysal
 */
public class L3_P24 {
	public static void main(String[] args) {
		String string;
		StringBuffer sb;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("Input String: ");
			string = scan.nextLine();
			
			if(string.length()==0) {
				break;
			}else {
				string = string.toLowerCase();
				string = string.replaceAll("[^a-z]", "");
				sb = new StringBuffer(string);
				
				if(string.equals(sb.reverse().toString())) {					
					System.out.println("Palindrome.");
				}else {
					System.out.println("Not Palindrome.");
				}
			}
		}	
		scan.close();
	}
}
