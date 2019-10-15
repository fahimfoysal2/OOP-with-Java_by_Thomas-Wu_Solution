/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 2 - Problem L2 P24
 *Jframe with fixed title,dimension & Position
 * 
 * @author Fahim Foysal
 */

import javax.swing.JFrame;

public class L2P24 {

	public static void main(String[] args) {
		JFrame myframe = new JFrame();
		
		myframe.setSize(300, 200);
		myframe.setTitle("My First Frame");
		myframe.setLocation(100, 50);
		
		myframe.setVisible(true);
	}
}
