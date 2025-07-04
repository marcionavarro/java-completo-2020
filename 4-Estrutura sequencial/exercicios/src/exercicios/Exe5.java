package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o código de uma peça 1, 
		 * o número de peças 1, o valor unitário de cada peça 1, 
		 * o código de uma peça 2, o número de peças 2 e o valor 
		 * unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, numeroDePecas1, numeroDePecas2;
		double valorDaPeca1, valorDaPeca2, total;
		
		cod1 = sc.nextInt();
		numeroDePecas1 = sc.nextInt();
		valorDaPeca1 = sc.nextDouble();
		
		cod2 = sc.nextInt();		
		numeroDePecas2 = sc.nextInt();		
		valorDaPeca2 = sc.nextDouble();
		
		total = numeroDePecas1 * valorDaPeca1 + numeroDePecas2 * valorDaPeca2;
		System.out.printf("Valor a pagar: R$ %.2f%n", total);
		
		sc.close();

	}

}
