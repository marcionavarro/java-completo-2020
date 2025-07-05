package application;

import java.util.Locale;
import java.util.Scanner;

import entity.CurrencyConverter;

public class ProgramCurrencyConverter {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual é o preço em dólar? ");
		double dollarPrice = sc.nextDouble();

		System.out.print("Quantos dólares serão comprados? ");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("Valor a ser pago em reais = %.2f%n", result);

		sc.close();

	}

}
