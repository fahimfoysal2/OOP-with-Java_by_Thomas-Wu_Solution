/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 2 - Problem L3 P30
 * @author Fahim Foysal
 */

import galapagos.*;

public class L3P30 {

	public static void main(String[] args) {
		Turtle turtle;
		turtle = new Turtle( );
		
		turtle.turn( 60 );
		turtle.move( 55 ); //move 50 pixels
		
		turtle.turn( -120 ); //turn 90 deg counterclockwise
		turtle.move( 55 );
		
		turtle.turn( -145 );
		turtle.move( 60 );
		
		turtle.turn(-155);
		turtle.move( 55 );
		
		turtle.turn( -155 );
		turtle.move(60);
	}
}
