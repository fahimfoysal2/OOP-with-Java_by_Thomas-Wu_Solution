/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 4 - Problem 12.java
 * Title: Weight Recommendation
 * 
 * @author Fahim Foysal
 */
package p12_Weight;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Weight {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.0");
		int age, height;
		Scanner scan = new Scanner(System.in);
		Height getRecom = new Height();
		
		System.out.print("Enter Height (in CM): ");
		height = scan.nextInt();
		System.out.print("Enter Age           : ");
		age = scan.nextInt();
		scan.close();
		
		getRecom.setWeight(age,height);
		
		System.out.print("\nRecommended Weight  : "+
				df.format(getRecom.getWeight()));
	}

}
