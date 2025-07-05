package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e
		 * imposto). Em seguida, mostrar os dados do funcionário (nome e salário
		 * líquido). Em seguida, aumentar o salário do funcionário com base em uma
		 * porcentagem dada (somente o salário bruto é afetado pela porcentagem) e
		 * mostrar novamente os dados do funcionário. Use a classe projetada abaixo.
		 * 
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();
		double percent;

		System.out.print("Nome: ");
		employee.name = sc.nextLine();

		System.out.print("Salário bruto: ");
		employee.grossSalary = sc.nextDouble();

		System.out.print("Imposto: ");
		employee.tax = sc.nextDouble();
		System.out.println();

		System.out.println("Funcionário(a): " + employee);
		System.out.println();

		System.out.print("Qual a porcentagem de aumento salarial? ");
		percent = sc.nextDouble();
		employee.increaseSalary(percent);
		System.out.println();

		System.out.print("Dados atualizados: " + employee);

		sc.close();
	}

}
