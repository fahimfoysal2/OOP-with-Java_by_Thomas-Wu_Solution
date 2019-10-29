package Chap6_L3_P27;

public class ManualTrigonomitry {
	
	private int num;
	double sinRes, cosRes;
	public ManualTrigonomitry(int x) {
		num = x;
	}
	
	public int fact(int y) {
		if(y==1) {
			return y;
		}else {
			y *= fact(y-1);
		}
		return y;
	}
	
	double sine() {
		int power = 3;
		boolean plusMinus = true;
		do {
			if(!plusMinus) {
				sinRes -=  Math.pow(num,power)/fact(power);
				plusMinus = true;
			}else {
				sinRes +=  Math.pow(num,power)/fact(power);
				plusMinus = false;
			}
			power++;
			System.out.print(sinRes + " ");
		} while (sinRes != Double.POSITIVE_INFINITY);
		
		return (num-sinRes);
	}
	
	double cos() {
		
		return cosRes;
	}
}
