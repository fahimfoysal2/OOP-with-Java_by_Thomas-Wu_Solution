import java.util.Scanner;

/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 6 - Problem L1_P07
 * Title: Prime Number Checker
 * 
 * @author Fahim Foysal
 */

public class chap6_L1_P07 {
	
	static void instruction() {
		System.out.print("Enter an integet to check ('-1' to stop): ");
	}
	
	public boolean primeChecker(int num) {
		boolean res=true;
		
		for(int i=2; i<= num/2; i++) {
			if(num%i == 0) {
				 res = false;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int numToCheck;
		Scanner scan = new Scanner(System.in);
		
		instruction();
		numToCheck = scan.nextInt();
		chap6_L1_P07 thisClass = new chap6_L1_P07();
		
		while(numToCheck>=0) {
			if(thisClass.primeChecker(numToCheck)==true) {
				System.out.println("Prime");
			}else {
				System.out.println("Not Prime");
			}
			instruction();
			numToCheck = scan.nextInt();
		}
		scan.close();
	}
}
