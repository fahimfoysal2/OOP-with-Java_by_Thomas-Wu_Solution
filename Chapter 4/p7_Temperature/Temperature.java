/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 4 - Problem 7.java
 * Title: Temperature Converter
 * 
 * @author Fahim Foysal
 */
package p7_Temperature;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Temperature {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double temperature;
		DecimalFormat df = new DecimalFormat("0.00");
		toCelsius celsiusConvert = new toCelsius();
		
		System.out.print("Enter temperature in Fahrenheit: ");
		temperature = scan.nextDouble();
		scan.close();
		
		celsiusConvert.setCelsius(temperature);
		System.out.print(temperature +" Fahrenheit is equal to "+
				df.format(celsiusConvert.getCelsius()) + " Celsius");
	}

}
