package p16_CoffeeBag;

public class CoffeeBag {
	private static final double pricePerPound = 5.99;
	private static final double taxRate       = 7.25;
	private double totalPrice;
	
	public CoffeeBag() {
		totalPrice = 0.0;
	}
	
	public void CalculatePrice(int bags, int weight) {
		totalPrice = bags*weight*pricePerPound;
		totalPrice = totalPrice + totalPrice*(taxRate/100);
	}
	
	public double getPricePerPound() {
		return pricePerPound;
	}
	
	public double getTaxRate() {
		return taxRate;
	}
	
	public double getPrice() {
		return totalPrice;
	}
	
}
