package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();

		list.add(new SavingsAccount(1001, "Marcio", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Joana", 1000.0, 400.0));
		list.add(new SavingsAccount(1003, "Bob", 500.00, 500.0));
		list.add(new BusinessAccount(1005, "Joana", 500.0, 500.0));

		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", sum);

		for (Account acc : list) {
			acc.deposit(10.0);
		}

		for (Account acc : list) {
			System.out.printf("Conta atualizada para %d : %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}

}
