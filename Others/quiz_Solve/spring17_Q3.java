package quiz_Solve;

import java.util.Scanner;

public class spring17_Q3 {

	public static void main(String[] args) {
		
		final int minCharge = 100, 
				  boundary  = 500;
		double unit, totalCharge, rate;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Consumed Unit: ");
		unit = scan.nextDouble();
		scan.close();
		
		if(unit<=100) {
			rate = 4.00; 
		}else if(unit<=200) {
			rate = 7.50;
		}else if(unit<=300) {
			rate = 10.00;
		}else {
			rate = 15.00;
		}
		
		totalCharge = rate * unit;
		if(totalCharge<minCharge) {
			totalCharge = minCharge;
		}else if(totalCharge > boundary) {
			totalCharge += totalCharge * .15 ;
		}
		
		System.out.format("Total Charge: %.2f", totalCharge);
		
	}
}
