package application;

import java.util.Locale;
import java.util.Scanner;

import entity.CurrencyConverter;

public class ProgramCurrencyConverter {

	/*
	 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a
	 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
	 * pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
	 * sobre o valor em dólar. Criar uma classe CurrencyConverter para ser
	 * responsável pelos cálculos.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.print("Qual é o preço em dólar? "); double dollarPrice =
		 * sc.nextDouble();
		 * 
		 * System.out.print("Quantos dólares serão comprados? "); double amount =
		 * sc.nextDouble();
		 * 
		 * double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		 * System.out.printf("Valor a ser pago em reais = %.2f%n", result);
		 */
		
		 double productsValue = sc.nextDouble();
	        sc.nextLine();
	        String couponCode = sc.nextLine();
	        
	        double discount = 0;
	        double cashback = 0;

	        if (couponCode.equals("DESC10") ) {
	            discount = productsValue * 0.10;
	        }

	        double discountedValue = productsValue - discount;

	        if (discountedValue >= 150.00) {
	        	cashback = 15.0;
	        }
	            

	        double finalValue = discountedValue - cashback;

	        System.out.printf("Valor final: R$ %.2f | Cashback: R$ %.2f\n", finalValue, cashback);

		sc.close();

	}

}
