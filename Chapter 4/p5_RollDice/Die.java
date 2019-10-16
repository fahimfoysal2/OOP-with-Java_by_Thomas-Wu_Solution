/**
 * Holds die & its functionality
 */
package p5_RollDice;

import java.util.Random;

public class Die {
	private Random random;
	private int number;
	
	private static final int max=6 ;
	private static final int min=1 ;
	
	public Die() {
		random = new Random();
		roll();
	}
	public void roll() {
		number = random.nextInt(max-min+1)+min;
		//getNumber();
	}
	
	public int getNumber() {
		return number;
	}
	
}
