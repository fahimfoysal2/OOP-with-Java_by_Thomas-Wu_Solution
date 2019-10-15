/**
 * Book: Introduction to OOP with Java - Thomas Wu
 * Chapter 2 - Problem L2-3 P 19,20 & 27 .java
 * Title: String to Date & count day numbers between two dates
 * 
 * @author Fahim Foysal
 */
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class L2P19_20_27 {
	public static void main(String args[]) {
		String startDay, endDay;
		Scanner scan = new Scanner(System.in);
		
		int date1, date2, today;
		int month, date, year, numOfDays;
		
		System.out.print("Enter Starting Day of Semester-(mm/dd/yyyy): ");
		startDay = scan.next();	//get string
		month = Integer.parseInt(startDay.substring(0,2));
		date  = Integer.parseInt(startDay.substring(3,5));
		year = Integer.parseInt(startDay.substring(6,10));
		date1 = new GregorianCalendar(year,month-1,date).get(Calendar.DAY_OF_YEAR);	//get date
		
		System.out.print("Enter  Ending  Day of Semester-(mm/dd/yyyy): ");
		endDay = scan.next();
		month = Integer.parseInt(endDay.substring(0,2));
		date  = Integer.parseInt(endDay.substring(3,5));
		year = Integer.parseInt(endDay.substring(6,10));
		scan.close();
		date2 = new GregorianCalendar(year,month-1,date).get(Calendar.DAY_OF_YEAR);
		
		numOfDays = date2 - date1;
		System.out.println("\nSemester Span: " + numOfDays + " Days." );
		
		today = new GregorianCalendar().get(Calendar.DAY_OF_YEAR);
		System.out.println("Days Pased   : " + (today-date1));
		System.out.println("Days Left    : " + (date2-today));
	}
}
