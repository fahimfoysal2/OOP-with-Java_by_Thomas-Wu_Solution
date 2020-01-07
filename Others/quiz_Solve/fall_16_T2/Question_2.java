package fall_16_T2;

import java.util.Scanner;

/**
 * Problem:-
 * Define a class named `triangle`
 * calculate Perimeter & area of a triangle.
 * 
 * @author Fahim Foysal
 */

/* the name of this class should be `triangle`
 * instead of Question_2 */
public class Question_2 {
	public static void main(String[] args) {
		int a,b,c, perimeter;
		double area, s;
		
		System.out.print("Enter a, b, c:  ");
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		scan.close();
		
		perimeter = a+ b+ c;
		
		s = perimeter/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Perimeter: "+ perimeter + "\n"
				+ "Area:  "+ area);
	}

}
