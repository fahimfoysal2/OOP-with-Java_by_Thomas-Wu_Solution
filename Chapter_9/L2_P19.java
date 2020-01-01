package Chapter_9;
import java.util.Scanner;

/**
 * Book: Introduction to OOP with Java - Thomas Wu Chapter_9 - Problem
 * L2_P19.java Title: Upper-Lower Case switch
 * 
 * @author Fahim Foysal
 */
public class L2_P19 {
	public static void main(String[] args) {
		String string;
		StringBuffer sb;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("Input String: ");
			string = scan.nextLine();
			sb = new StringBuffer(string);
			
			if(string.length()==0) {
				break;
			}else {
				for(int i = 0; i< string.length(); i++) {
					if(Character.isUpperCase(string.charAt(i))) {
						sb.setCharAt(i, Character.toLowerCase(string.charAt(i)));
					}else {
						sb.setCharAt(i, Character.toUpperCase(string.charAt(i)));
					}
				}
				System.out.println(sb);
			}
		}
		scan.close();
	}
}
