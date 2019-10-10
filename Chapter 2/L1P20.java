/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 2 - Problem L1 P20
 * 
 * @author Fahim Foysal
 */

import java.util.*;
import java.text.*;

public class L1P20 {

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM YYYY");
		
		System.out.println(sdf.format(today));
	}
}
