package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

/*
 * Uma empresa possui funcionários próprios e terceirizados. Para cada
 * funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora.
 * Funcionários terceirizado possuem ainda uma despesa adicional.
 
 * O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas
 * trabalhadas, sendo que os funcionários terceirizados ainda recebem um bônus
 * correspondente a 110% de sua despesa adicional. 
 
 * Fazer um programa para ler os  dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma
 * lista. Depois de ler todos os dados, mostrar nome e pagamento de cada
 * funcionário na mesma ordem em que foram digitados.
 */

public class ExercicioResolvido {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Insira o número de funcionários: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do Funcionário nº :" + i);
			System.out.print("Terceirizado (s/n)? ");
			char ch = sc.next().charAt(0);

			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Horas: ");
			int hours = sc.nextInt();

			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();

			if (ch == 's') {
				System.out.print("Custo adicional: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Pagamentos: ");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - R$ " + String.format("%.2f", emp.payment()));
		}

		sc.close();
	}

}
