package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrderItem;
import entities.OrderProduct;
import entities.Product;
import entities.enums.OrderStatus;

public class Exercicio3 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Insira os dados do cliente:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.next();
		System.out.print("Data de nascimento (DD/MM/AAAA): ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(name, email, birthDate);

		System.out.println("Insira os dados do pedido:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		OrderProduct orderProduct = new OrderProduct(new Date(), status, client);

		System.out.print("Quantos itens há neste pedido?");
		int pedidos = sc.nextInt();

		for (int i = 1; i <= pedidos; i++) {
			System.out.println("Insira os dados do item nº " + i + ":");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Preço do produto: ");
			double productPrice = sc.nextDouble();
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantidade: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			orderProduct.addItem(orderItem);
		}

		System.out.println();
		System.out.println("RESUMO DO PEDIDO:");
		System.out.println(orderProduct);
		
		sc.close();
	}

}
