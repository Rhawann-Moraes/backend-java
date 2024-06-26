package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario f1 = new Funcionario();
	
		System.out.println("Insira seu nome: ");
		f1.setNome(sc.nextLine());
		System.out.println("Insira o valor do seu salário bruto: ");
		f1.setSalarioBruto(sc.nextDouble());
		System.out.println("Insira o valor do seu imposto a ser descontado: ");
		f1.setImposto(sc.nextDouble());
		
		System.out.println("Salário Liquido: " + f1.toString());
		
		System.out.println();
		System.out.println("Insira a sua porcentagem de aumento: ");
		f1.calcularAumento(sc.nextDouble());
		System.out.println("Dados atualizados: " + f1.toString());
		
		
		sc.close();
	}

}
