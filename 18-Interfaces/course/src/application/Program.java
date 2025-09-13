package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

		System.out.println("Insira os dados da locação");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();

		System.out.print("Retirada (dd/MM/aaaa hh:mm): ");
		Date start = sdf.parse(sc.nextLine());

		System.out.print("Devolução (dd/MM/aaaa hh:mm): ");
		Date finish = sdf.parse(sc.nextLine());

		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Insira o preço por hora: ");
		double pricePerHour = sc.nextDouble();

		System.out.print("Insira o preço por dia: ");
		double pricePerDay = sc.nextDouble();

		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		rentalService.processInvoice(cr);

		System.out.println();
		System.out.println("NOTA FISCAL:");
		System.out.println("Pagamento base: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

		sc.close();
	}

}
