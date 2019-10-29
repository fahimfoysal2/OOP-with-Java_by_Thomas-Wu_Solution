import java.awt.Container;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;

/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 6 - P 28  - Draw Clock
 * Title: 
 * 
 * @author Fahim Foysal
 */

public class Chap6_L3_P28 {
	
	public static void main(String[] args) {
		JFrame win;
		Container contentPane;
		Graphics g;
		
		win = new JFrame();
		win.setSize(350, 400);
		win.setLocation(100,100);
		win.setVisible(true);
		try {Thread.sleep(200);} catch (Exception e) {}
		
		contentPane = win.getContentPane();
		g = contentPane.getGraphics();
		
		// Length of hands
		int minHand = 85;
		int hourHand = 65;
		int border	= 100;
		
		double clockPoint;
		for(int i = 0; i<60; i+=5) {
			clockPoint = (90-i*6.0)*(Math.PI/180);
			g.drawOval((int)(150+border*Math.cos(clockPoint)), (int)(150-border*Math.sin(clockPoint)), 10, 10);
		}
		
		int hour, min;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Hour: ");
		hour = scan.nextInt(); 
		System.out.print("Enter Minute: ");
		min= scan.nextInt();
		scan.close();
		double mAngle = (90-min*6.0)*(Math.PI/180);
		double hAngle = (90-(hour+min/60.0)*30)*(Math.PI/180);
		
		g.drawLine(150,150, (int)(150+hourHand*Math.cos(hAngle)), (int)(150-hourHand*Math.sin(hAngle)));
		g.drawLine(150,150, (int)(150+minHand*Math.cos(mAngle)), (int)(150-minHand*Math.sin(mAngle)));
		
		//win.dispose();
		g.dispose();
	}

}
