package Chap5_L3_P17;

enum Romans{
	M(1000),
	CM(900),
	D(500),
	CD(400),
	C(100),
	XC(90),
	L(50),
	Xl(40),
	X(10),
	IX(9),
	V(5),
	IV(4),
	I(1);
	
	private int romValue;
	
	private Romans(int valSet) {
		this.romValue = valSet;
	}
	
	public int value() {
		return this.romValue;
	}
}
