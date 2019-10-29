/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 6 - Problem L2_P15
 * Title: Perfect number Checker & show divisors 
 * 
 * @author Fahim Foysal
 */
package Chap6_L2_P15;

import java.util.Random;
import java.util.Scanner;

public class PerfectNumber {
	
	static int RandomGen(int min, int max) {
		Random random = new Random();
		int res = random.nextInt((max-min)+1)+min;
		System.out.println("\nRandom Number to check: "+ res);
		return res;
	}
	
	static void PerfectChecker(int num) {
		int perfectSum= 1;
		System.out.format("The divisors are: 1");
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				perfectSum += i;
				System.out.format("%3d ", i );
			}
		}
		
		if(perfectSum == num) {
			System.out.println("\nIt's a Perfect Number.");
		}else {
			System.out.println("\nIt's NOT a Perfect Number.");
		}
	}
	
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number to Check: ");
		num = scan.nextInt();
		scan.close();
		
		PerfectChecker(num);
		
		PerfectChecker(RandomGen(20, 30));
		PerfectChecker(RandomGen(490, 500));
	}
}
