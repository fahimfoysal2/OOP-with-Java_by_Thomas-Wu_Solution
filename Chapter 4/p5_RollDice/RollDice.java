/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 4 - Problem 5.java
 * Title: Roll a Die Three Times
 * @author Fahim Foysal
 * 
 * Driver class
 */
package p5_RollDice;

public class RollDice {
	public static void main(String[] args) {
		Die die = new Die();	// create new die & roll once
		System.out.println("Roll 1: " + die.getNumber());
		
		die.roll();
		System.out.println("Roll 2: " + die.getNumber());
		
		die.roll();
		System.out.println("Roll 3: " + die.getNumber());
	}

}
