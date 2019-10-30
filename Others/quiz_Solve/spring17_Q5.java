package quiz_Solve;

public class spring17_Q5 {

	public static void main(String[] args) {
		int lastNum = (int)Math.pow(2, 10);
		int driver  = 1;
		int sum = 0;
		System.out.print("for loop  :");
		for(int i= 1; i<lastNum; i+=driver) {
			System.out.print(i + " ");
			driver *= 2;
			sum+=i;
		}
		
		
		System.out.print("="+sum+"\nWhile loop:");
		sum = 0;
		driver = 1;
		int looper = 1;
		while(looper <= lastNum) {
			sum += looper;
			System.out.print(looper + " ");
			driver = driver * 2;
			looper += driver;
		}
		
		System.out.print("="+sum+"\nDo - While loop:");
		driver = 1;
		looper = 1;
		sum = 0;
		do {
			sum += looper;
			System.out.print(looper + " ");
			driver = driver * 2;
			looper += driver;
		}while(looper<=lastNum);
		
		System.out.print("="+sum);
	}

}
