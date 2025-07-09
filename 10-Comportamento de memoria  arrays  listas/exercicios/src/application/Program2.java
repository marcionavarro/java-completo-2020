package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program2 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e
		 * salario) de N funcionários. Não deve haver repetição de id.
		 * 
		 * Em seguida, efetuar o aumento de X por cento no salário de um determinado
		 * funcionário. Para isso, o programa deve ler um id e o valor X. Se o id
		 * informado não existir, mostrar uma mensagem e abortar a operação. Ao final,
		 * mostrar a listagem atualizada dos funcionários, conforme exemplos.
		 * 
		 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o
		 * salário possa ser mudado livremente. Um salário só pode ser aumentado com
		 * base em uma operação de aumento por porcentagem dada.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.print("Quantos funcionários serão registrados? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcionário(a) #" + i + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();

			while (hasId(list, id)) {
				System.out.print("Já tinha escolhido. Tente novamente: ");
				id = sc.nextInt();
			}

			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Salario: ");
			double salary = sc.nextDouble();

			list.add(new Employee(id, name, salary));
		}

		System.out.println();
		System.out.print("Digite o ID do funcionário que terá aumento salarial: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Este id não existe!");
		} else {
			System.out.println("Insira a porcentagem:");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}

		System.out.println();
		System.out.println("funcionários(a)");
		for (Employee obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
