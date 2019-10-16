package p12_Weight;

public class Height {
	 private static final double constant = 0.90;
	 private double recommendedWeight;
	 
	 public Height() {
		 recommendedWeight = 0;
	 }
	 
	 public void setWeight(int age, int height) {
		 recommendedWeight = (height-100+age/10)*constant;
	 }
	 
	 public double getWeight() {
		 return recommendedWeight;
	 }
}
