package util;

public class CurrencyConverter {

	public static double IOF = 0.06;
	
	public static double total(double price, double dollars) {
		return price * dollars * (1.0 + IOF);
	}
		
	
}
