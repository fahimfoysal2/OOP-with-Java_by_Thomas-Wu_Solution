package spring_17_T3;

public class Person {
	String name, NationalID, gender;
	
	public void input(String n, String id, String g) {
		name = n;
		NationalID = id;
		gender = g;
	}
	
	public void display() {
		System.out.println("Name: " + name +"\n"
				+ "National ID: " + NationalID +"\n"
				+ "Gender: "+ gender);
	}
}
