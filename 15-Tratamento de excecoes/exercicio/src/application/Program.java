package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

/**
 * Fazer um programa para ler os dados de uma conta bancária e depois realizar
 * um saque nesta conta bancária, mostrando o novo saldo. Um saque não pode
 * ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior
 * ao limite de saque da conta. Implemente a conta bancária conforme projeto
 * abaixo:
 */

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira os dados da conta");

		System.out.print("Número: ");
		int number = sc.nextInt();

		System.out.print("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.print("Saldo inicial: ");
		double balance = sc.nextDouble();

		System.out.print("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();

		Account acc = new Account(number, holder, balance, withdrawLimit);

		System.out.println();
		System.out.print("Insira o valor do saque: ");
		double amount = sc.nextDouble();

		try {
			acc.withdraw(amount);
			System.out.println(acc);
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}
