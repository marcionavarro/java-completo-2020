package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProduct {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Insira os dados do produto:");

		System.out.print("Nome: ");
		product.name = sc.nextLine();

		System.out.print("Preço: ");
		product.price = sc.nextDouble();

		System.out.print("Quantidade em estoque: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto: "+ product);
		
		System.out.println();
		System.out.println("Insira a quantidade de produtos a serem adicionados ao estoque:");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Dados atualizados: "+ product);
		
		System.out.println();
		System.out.println("Informe a quantidade de produtos a serem retirados do estoque:");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Dados atualizados: "+ product);

		
		sc.close();
	}
}
