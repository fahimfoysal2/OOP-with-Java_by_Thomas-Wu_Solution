package Chapter_9;
import java.util.Scanner;

/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter_9 - Problem L2_P13.java
 * Title: UpperCase letter count
 * 
 * @author Fahim Foysal
 */
public class L2_P13 {
	public static void main(String[] args) {
		String string;
		int counter;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			counter = 0;
			System.out.print("Input String: ");
			string = scan.nextLine();
			
			if(!(string.length()>0)) {
				break;
			}else {
				for(int i =0; i<string.length(); i++) {
					if(Character.isUpperCase(string.charAt(i))){
						counter++;
					}
				}
				System.out.println("Number of Uppercase letter: "+counter);
			}
		}
		scan.close();
	}
}
