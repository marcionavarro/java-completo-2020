package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os valores da largura e altura de um retângulo. Em
		 * seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma
		 * classe como mostrado no projeto ao lado.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();

		System.out.println("Insira a largura e a altura do retângulo:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETRO = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		sc.close();

	}
}
