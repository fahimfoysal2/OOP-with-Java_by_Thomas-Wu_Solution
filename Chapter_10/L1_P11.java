package Chapter_10;
import java.util.Scanner;

/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter_10 - Problem L1_P11.java
 * Title: Compute Standard deviation
 * 
 * @author Fahim Foysal
 */
public class L1_P11 {
	public static void main(String[] args) {
		int[] numbers;
		int N;
		double sum = 0,avg, deviation;
		Scanner scan = new Scanner(System.in);
		
		// Number of N
		System.out.print("Total Numbers- N = ");
		N = scan.nextInt();
		numbers = new int[N];
		
		// get all N & total sum
		System.out.print("Enter numbers: ");
		for(int i = 0; i<N; i++) {
			numbers[i] = scan.nextInt();
			sum += numbers[i];
		}
		
		// Average
		avg = sum/N;
		sum = 0;
		
		for(int i = 0; i<N; i++) {
			sum += (numbers[i] - avg) * (numbers[i] - avg);
		}
		
		deviation = Math.sqrt(sum/N);
		
		System.out.println("Standard Deviation- S= "+ deviation);
		
		scan.close();
	}
}
