package Chapter_13_P06;

class Dog extends Pet {
	private double weight;

	public String fetch() {
		return "Yes, master. Fetch I will.";
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}