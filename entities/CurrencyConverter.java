package entities;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double amount(double dollarPrice, double dollarBought) {
		return dollarBought * dollarPrice * (1.0 + IOF);
	}
}
