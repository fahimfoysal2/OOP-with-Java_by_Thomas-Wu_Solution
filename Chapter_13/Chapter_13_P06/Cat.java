package Chapter_13_P06;

class Cat extends Pet {
	private String catColor;

	public String speak() {
		return "Don't you dare give me orders.\n" + "I speak only when I want to.";
	}

	public String getColor() {
		return catColor;
	}

	public void setColor(String catColor) {
		this.catColor = catColor;
	}
}