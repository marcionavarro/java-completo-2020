package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve
		 * nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro
		 * valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer
		 * também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo,
		 * quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é
		 * 60% da nota). Você deve criar uma classe Student para resolver este problema.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		System.out.print("Aluno: ");
		student.name = sc.nextLine();
		System.out.print("Nota 1: ");
		student.n1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		student.n2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		student.n3 = sc.nextDouble();
		System.out.println();
		
		System.out.printf("FINAL GRADE %.2f%n", student.finalGrade());

		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f PONTOS%n", student.missingPoint());
		} else {
			System.out.println("PASS");
		}

		sc.close();

	}

}
