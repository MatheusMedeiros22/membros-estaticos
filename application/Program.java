package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the dollar price?");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double dollarBought = sc.nextDouble();
		
		double amount =  CurrencyConverter.amount(dollarPrice, dollarBought);
		
		System.out.println("Amount to be paid in reais: " + amount);
		
		
		sc.close();
	}

}
