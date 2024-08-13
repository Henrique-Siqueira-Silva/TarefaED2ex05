package controller;

public class Ex05 {
	
	public Ex05() {
		super();
	}
	
	public double MDC (double x, double y) {
		if ( x == y ) {
			return x;
		}else {
			if (x > y) {
				return MDC ((x - y), y);
			}else {
				return MDC (y , x);
			}
		}
	}

}
