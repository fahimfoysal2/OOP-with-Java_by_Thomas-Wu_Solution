package p7_Temperature;

public class toCelsius {
	
	private double temp;
	
	public toCelsius() {
		temp = 0.00;
	}
	
	public void setCelsius(double temperature) {
		temp = ((temperature-32)*5)/9 ;
	}
	
	public double getCelsius() {
		return temp;
	}
}
