package myutil;
/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 7 - Problem L2_P15.java
 * Title: Create MealCard class in  "myutil" package 
 * 
 * @author Fahim Foysal
 */

public class Mealcard {
	
	private int balance;
	
 	public Mealcard() {
 		this.balance = 100;
 	}
 	
 	public Mealcard(int balance) {
 		this.balance = balance;
 	}
 	
 	public void purchasePoints(int point) {
 		balance += point;
 	}
 	
 	public void deductPoint(int point) {
 		if(balance-point>=0) {
 			balance -= point;
 			System.out.println(point + "point spent.");
 		}else {
 			System.out.println("Insufficient Balance.");
 		}
 	}
 	
 	public int getBalance() {
 		return this.balance;
 	}
	 	
}
