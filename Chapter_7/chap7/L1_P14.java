/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 7 - Problem L1_P14.java
 * Title: Test "Person" class from  "myutil" package 
 * 
 * @author Fahim Foysal
 */
package chap7;
import myutil.*;

public class L1_P14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Person person = new Person();
		 System.out.println("After calling constructor :  " + person.getName());
		 
		 person.setName("Fahim Foysal Rabby");
		 System.out.println("After Call setName method :  " + person.getName());
	}

}
