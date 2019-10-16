package p7_Temperature;

public class toFahrenheit {
	private double temp;
	
	public toFahrenheit() {
		temp = 0.00;
	}
	
	public void setFahrenheit(double temperature) {
		temp = temperature*(9f/5) + 32 ;
	}
	
	public double getFahrenheit() {
		return temp;
	}
}
