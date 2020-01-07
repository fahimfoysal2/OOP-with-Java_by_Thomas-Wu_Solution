/**
 *Problem:-
 * create person class with 3 data & 2 methods
 * in main -> array of 4 person object
 * loop -> display
 * 
 * @author Fahim Foysal
 */
package spring_17_T3;

public class Q4 {
	public static void main(String[] args) {
		// Person array
		Person[] person = new Person[4];
		
		// person object in array
		for(int i =0; i<4; i++) {
			person[i] = new Person();
		}
		
		// input persons
		person[0].input("fahim", "123", "male");
		person[1].input("foysal", "234", "male");
		person[2].input("Rabby", "345", "male");
		person[3].input("third Person", "999", "x");
		
		// display persons
		for(int i =0; i<4; i++) {
			person[i].display();
			System.out.print("\n");
		}
	}

}
