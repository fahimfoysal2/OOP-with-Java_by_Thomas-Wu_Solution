/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 2 - Problem L4P36.java
 * @author Fahim Foysal
 */

import galapagos.*;

public class L4P36 {
	
	public static void drawWindow(Turtle turtle) {
		turtle.turn( -90 );
		turtle.move( 30 );
		
		turtle.turn( -90 );
		turtle.move( 30 );
		
		turtle.turn( -90 );
		turtle.move( 30 );
		
		turtle.turn( -90 );
		turtle.move( 30 );
	}

	public static void main(String[] args) {
		Turtle turtle =new Turtle() ;
		turtle.speed(100);
		
		//go to roof start position
		turtle.penUp();
		turtle.jumpTo(-150, 0);
		
		//start roof draw
		turtle.penDown();
		turtle.moveTo(0, 100);
		turtle.moveTo(150, 0);
		turtle.moveTo(-150, 0);
		
		//draw wall
		turtle.jumpTo(-100, 0);
		turtle.moveTo(-100, -140);
		turtle.moveTo(100, -140);
		turtle.moveTo(100, 0);
		
		//draw door
		turtle.jumpTo(25, -140);
		turtle.moveTo(25, -50);
		turtle.moveTo(-25, -50);
		turtle.moveTo(-25, -140);
		
		// draw right window
		turtle.jumpTo(65, -60);
		drawWindow(turtle);
		
		// draw left window
		turtle.jumpTo(-35, -60);
		drawWindow(turtle);
		
		turtle.hide();
	}
}
