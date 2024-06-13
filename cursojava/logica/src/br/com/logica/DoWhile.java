package br.com.logica;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char voltar = 'n';
		
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double f = 9*c/5 + 32;
			System.out.printf("Temperatura em Celsius: %.1f°C%n", c);
			System.out.printf("Equivalente em Fahrenheit: %.1f°F%n" , f);
			System.out.print("Deseja voltar a operação?(s/n)");
			voltar = sc.next().charAt(0);
		}while(voltar != 'n');
		
		sc.close();
	}

}
