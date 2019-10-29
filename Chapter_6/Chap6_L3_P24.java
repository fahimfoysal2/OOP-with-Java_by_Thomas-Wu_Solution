import java.util.Scanner;

/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 6 - Problem L3_P24
 * Title: Print Pattern : X
 * 
 * @author Fahim Foysal
 */

public class Chap6_L3_P24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length : ");
		int length = scan.nextInt();
		scan.close();
		
		for(int i=1; i<=length; i++) {
			for(int j=1; j<=length; j++) {
				if(i==j) {
					System.out.print("X");
				}
				else if(i+(j-1)==length) {
					System.out.print("X");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}