package Chapter_10;
/**
 * Book: Introduction to OOP with Java - Thomas Wu 
 * Chapter_10 - Problem L1_P13.java 
 * Title: PayScaleTable
 * 
 * @author Fahim Foysal
 */

public class L1_P13 {
	public static void main(String[] args) {
		double[][] payScaleTable = { 
				{ 10.50, 12.00, 14.50, 16.75, 18.00 }, 
				{ 20.50, 22.25, 24.00, 26.25, 28.00 },
				{ 34.00, 36.50, 38.00, 40.35, 43.00 }, 
				{ 50.00, 60.00, 70.00, 80.00, 99.99 }
		};
		// average pay of Every grade Level employees
		double sum = 0, average;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				sum += payScaleTable[i][j];
			}
			average = sum / 5;
			System.out.println(" Average of Level " + i + " Employees: " + average);
		}
		sum = 0.0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				sum += payScaleTable[j][i];
			}
			average = sum / 5;
			System.out.println(" Average pay of step " + i + " : " + average);
		}
	}
}
