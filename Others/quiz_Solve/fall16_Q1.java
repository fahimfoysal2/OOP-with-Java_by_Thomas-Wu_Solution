
package quiz_Solve;

public class fall16_Q1 {
	public static void main(String[] args) {
		int sum =0; 
		for(int i = 1, j=5; i<=20; i++, j+=5) {
			System.out.print(i + " " +j +" " );
			sum += (i + j);
		}
		
		System.out.print("="+sum+"\n");
		sum=0;
		int num1 = 1,
			num2 = 5;
		do {
			System.out.print(num1 + " " +num2 +" " );
			sum += (num1 + num2); 
			num1 ++;
			num2 += 5;
		} while (num1<=20);
		
		System.out.print("="+sum);
	}
}
