package exercicios;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		/*
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
		 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
		 * de 0 é 1.
		 */

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int fat = 1;
		for (int i = 1; i <= N; i++) {
			fat = fat * i;
		}

		System.out.println(fat);

		sc.close();
	}

}
