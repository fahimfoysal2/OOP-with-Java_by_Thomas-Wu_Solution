package Chap5_L2_P15;

public class Triangle {
	public static final int INVALID_DIMENSION = -1;
	private double a,b,c, checker;

	public Triangle(double x,double y,double z) {
		setValues(x,y,z);
	}
	
	public void setValues(double x, double y, double z) {
		if(x*y*z != 0) {
			a = x;
			b = y;
			c = z;
		}else {
			checker = INVALID_DIMENSION;
		}
	}

	private boolean isValid() {
		return checker != INVALID_DIMENSION;
	}
	
	public double getArea() {
		double area = INVALID_DIMENSION;
		if(isValid()) {
			double s = (a+b+c)/2;
			area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		}
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = INVALID_DIMENSION;
		if(isValid()) {
			perimeter = a + b + c;
		}
		return perimeter;
	}
	
}
