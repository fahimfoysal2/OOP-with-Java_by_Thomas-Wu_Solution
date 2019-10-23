import java.util.Scanner;

/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 5 - Problem L2 P13
 * Title: Wage Calculation
 * 
 * @author Fahim Foysal
 */

public class Chap5_L2_P13 {
	
	final static int basicTime  = 8;
	final static double basicRate       = 7.25;
	final static double ovTimeRate      = basicRate * 1.5;
	final static double commissionType1 = 0.05;
	final static double commissionType2 = 0.10;
	final static double commissionType3 = 0.15;
	
	public static void main(String[] args) {
		double hourWorked, ovTime=0, totalSales, wage = 0;
		
		System.out.print("Enter total work hour  : ");
		Scanner scan = new Scanner(System.in);
		hourWorked = scan.nextDouble();
		System.out.print("Enter total sales made : $");
		totalSales = scan.nextDouble();
		scan.close();
		
		// Overtime Calculate
		if(hourWorked>basicTime) {
			ovTime = hourWorked - basicTime;
		}
		
		// Commission Calculate
		if(totalSales<100) {
			wage+= totalSales * commissionType1;
		}else if(totalSales<300) {
			wage+= totalSales * commissionType2;
		}else if(totalSales>=300) {
			wage+= totalSales * commissionType3;
		}
		
		wage += (basicTime*basicRate) + (ovTime*ovTimeRate);
		
		System.out.print("Total Wage Earned      : $" + wage);
		
	}
}
