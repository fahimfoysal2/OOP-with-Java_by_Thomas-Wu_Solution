package chap7;
import myutil.Mealcard;

/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 7 - Problem L2_P16.java
 * Title: Test "MealCard" class from  "myutil" package 
 * 
 * @author Fahim Foysal
 */

public class L2_P16 {
	public static void main(String[] args) {
		Mealcard mealcard1 = new Mealcard();
		Mealcard mealcard2 = new Mealcard(135);
		
		System.out.println("Card 1 with default balance : "+
				mealcard1.getBalance());
		System.out.println("Card 2 with custom  balance : "+
				mealcard2.getBalance());
		
		// try spending 110 points
		System.out.print("\nTry spending 110 points: ");
		System.out.print("\nCard 1 : ");
		mealcard1.deductPoint(110);
		System.out.print("Card 2 : ");
		mealcard2.deductPoint(110);
		
		System.out.print("\nbalance after spending 110 points: \n"
				+ "Card 1 : "+mealcard1.getBalance());
		System.out.print("\n"
				+ "Card 2 : "+mealcard2.getBalance());
		
		//purchase 50 points
		mealcard1.purchasePoints(50);
		mealcard2.purchasePoints(50);
		System.out.print("\nbalance after purchase 50 points: \n"
				+ "Card 1 : "+mealcard1.getBalance());
		System.out.print("\n"
				+ "Card 2 : "+mealcard2.getBalance());
	}
}
