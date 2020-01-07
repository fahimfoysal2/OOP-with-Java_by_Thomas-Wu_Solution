package fall_16_T2;

/** 
 * Problem:-
 * Do While statement to compute following sum and products
 * 1+5+2+10+3+15+......+20+100
 * 
 * @author Fahim Foysal
 */

public class Question_1 {
	public static void main(String[] args) {
		int sum = 0,
		num1 = 1,
		num2 = 5;
		
		do {
			System.out.print(num1 +"+"+ num2 +"+");
			sum += (num1 + num2);
			num1 ++;
			num2 += 5;
		}while(num1<=20);
		
		System.out.println("\nTotal Sum: "+ sum);
	}
}
