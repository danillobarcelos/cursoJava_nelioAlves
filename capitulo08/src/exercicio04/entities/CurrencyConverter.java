package exercicio04.entities;

public class CurrencyConverter {
	public static final double IOF = 6;

	public static double dolarConverted(double amount, double dolarPrice) {
		return amount * dolarPrice * (1 + (IOF/100)) ;
	}
}
