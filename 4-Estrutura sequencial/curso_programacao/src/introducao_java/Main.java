package introducao_java;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		
		System.out.println("RESULATADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros %n", x);
		
		System.out.printf("%s têm %d anos e ganha R$ %.2f reais. %n", nome, idade, renda);
	}

}
