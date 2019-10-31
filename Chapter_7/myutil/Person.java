package myutil;
/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 7 - Problem L1_P13
 * Title: Create "Person" class in  "myutil" package 
 * 
 * @author Fahim Foysal
 */

public class Person {
	private String name;
	
	public Person( ) {
		name = "Unknown";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}