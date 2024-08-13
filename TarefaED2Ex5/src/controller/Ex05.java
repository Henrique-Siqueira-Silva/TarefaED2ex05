package controller;

public class Ex05 {
	
	public Ex05() {
		super();
	}
	
	public double MDC (double a, double b) {
		if (a % b == 0) { 
			return b;
		}
		return MDC(a, (a % b));
		
	}

}
