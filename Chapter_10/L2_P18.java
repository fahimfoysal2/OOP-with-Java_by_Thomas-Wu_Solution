package Chapter_10;
import java.util.Scanner;

/**
 * Book: Introduction to OOP with Java - Thomas Wu 
 * Chapter_10 - Problem L2_P18.java 
 * Title: Fortune Telling
 * 
 * @author Fahim Foysal
 */
public class L2_P18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String status;
		Fortune fortune = new Fortune();
		while (true) {
			System.out.println("Fortune (Y/N)? ");
			status = scan.next();
			if (status.equalsIgnoreCase("N"))
				break;
			else {
				System.out.println(fortune.getRandomFortune());
			}
		}
		scan.close();
	}
}
