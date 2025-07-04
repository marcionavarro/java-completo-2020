package exercicios;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro, e 
		 * depois dizer se este número é negativo ou não.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		n = sc.nextInt();
		
		if(n >= 0) {
			System.out.println("NAO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();

	}

}
