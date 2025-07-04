package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
		 * o valor que recebe por hora e calcula o salário desse funcionário. 
		 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numeroDoFuncionario, numeroDeHorasTrabalhadas;
		double valorPorHoraTrabalhada, salario;
		
		System.out.println("Digite o numero do Funcionario");
		numeroDoFuncionario = sc.nextInt();
		
		System.out.println("Digite o numero de horas trabalhadas");
		numeroDeHorasTrabalhadas = sc.nextInt();
		
		System.out.println("Digite o valor por hora trabalhada");
		valorPorHoraTrabalhada = sc.nextDouble();
		
		salario = numeroDeHorasTrabalhadas * valorPorHoraTrabalhada;
		
		System.out.printf("Number = %s %n", numeroDoFuncionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();
	}

}
