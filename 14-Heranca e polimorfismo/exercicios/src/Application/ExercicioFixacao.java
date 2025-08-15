package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

/**
 * Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário).
 * Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que
 * foram digitados.
 * 
 * Todo produto possui nome e preço. Produtos importados possuem uma taxa de
 * alfândega, e produtos usados possuem data de fabricação. Estes dados
 * específicos devem ser acrescentados na etiqueta de preço conforme exemplo
 * (próxima página). Para produtos importados, a taxa e alfândega deve ser
 * acrescentada ao preço final do produto.
 */

public class ExercicioFixacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.print("Insira a quantidade de produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do produto nº " + i + ":");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char ch = sc.next().charAt(0);

			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Preço: ");
			double price = sc.nextDouble();

			if (ch == 'c') {
				list.add(new Product(name, price));
			} else if (ch == 'u') {
				System.out.print("Data de fabricação: ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			} else {
				System.out.print("Taxa alfandegária: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
		}

		System.out.println();
		System.out.println("Etiquetas de preço: ");

		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}

		sc.close();

	}

}
