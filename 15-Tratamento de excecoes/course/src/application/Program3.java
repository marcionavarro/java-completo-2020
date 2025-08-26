package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

/**
 * Fazer um programa para ler os dados de uma reserva de hotel (número do
 * quarto, data de entrada e data de saída) e mostrar os dados da reserva,
 * inclusive sua duração em dias. Em seguida, ler novas datas de entrada e
 * saída, atualizar a reserva, e mostrar novamente a reserva com os dados
 * atualizados. O programa não deve aceitar dados inválidos para a reserva,
 * conforme as seguintes regras: - Alterações de reserva só podem ocorrer para
 * datas futuras - A data de saída deve ser maior que a data de entrada
 */

public class Program3 {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Número do quarto: ");
			int number = sc.nextInt();

			System.out.print("Data de check-in (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Data de check-out (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());

			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reserva: " + reservation);

			System.out.println();
			System.out.println("Insira os dados para atualizar a reserva:");
			System.out.print("Data de check-in (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data de check-out (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());

			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		} catch (ParseException e) {
			System.out.println("Formato de Data inválido");
		} catch (DomainException e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
	}

}
