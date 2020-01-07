/**
 *Problem:-
 * compute sum-
 * 1+3+7+15+31+.....+(2^20-1)
 * 
 * @author Fahim Foysal
 */
package spring_17_T2;

public class Q5 {
	public static void main(String[] args) {
		int
		sum =0,
		increment = 1,
		//1048575 = 2^20-1
		limit = (int)Math.pow(2, 20)-1;
		
		// --------- for
		for(int i = 1; i<=limit; i += increment) {
			System.out.print(i+ " + ");
			increment *= 2;
			sum += i;
		}
		System.out.println("For = "+ sum);
		
		// --------- do - while
		sum = 0;
		int looper = increment = 1;
		do {
			sum += looper;
			System.out.print(looper+ " + ");
			increment *= 2;
			looper += increment;
		}while(looper<=limit);
		System.out.println("do while = "+ sum);
		
		// ---------- while
		sum = 0;
		looper = increment = 1;
		while(looper<=limit) {
			sum += looper;
			System.out.print(looper+ " + ");
			increment *= 2;
			looper += increment;
		}
		System.out.println("While = "+ sum);
	}
}
