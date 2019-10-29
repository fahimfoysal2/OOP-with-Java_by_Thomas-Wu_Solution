/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 6 - Problem L2 - P 13
 * Title: Prime number calculation time check
 * 
 * @author Fahim Foysal
 */
package chap6_L2_P13;

import java.util.Date;
import java.util.Scanner;

public class primeTime {

	public static void main(String[] args) {
		int N;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Prime Range: ");
		N = scan.nextInt();
		scan.close();
		Prime prime = new Prime(); 
		
		System.out.print("Generated Primes :");
		Date startTime = new Date();
		prime.generatePrime(N);
		Date endTime = new Date();
		
		System.out.format("\nElapsed Time     : %d ms",(endTime.getTime() - startTime.getTime()));
	}

}
