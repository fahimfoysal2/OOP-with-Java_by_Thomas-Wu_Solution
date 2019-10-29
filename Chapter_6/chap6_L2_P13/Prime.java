package chap6_L2_P13;

public class Prime {
	
	public boolean primeChecker(int num) {
		boolean res=true;
		
		for(int i=2; i<= num/2; i++) {
			if(num%i == 0) {
				 res = false;
			}
		}
		return res;
	}
	
	public void generatePrime(int num) {
		for(int i=2; i<=num; i++) {
			if(primeChecker(i)) {
				System.out.format("%3d", i);
			}
		}
	}
}
