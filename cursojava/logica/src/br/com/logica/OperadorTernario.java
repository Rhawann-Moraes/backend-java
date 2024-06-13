package br.com.logica;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean maiorDeIdade;
		System.out.println("Você é maior de idade? (true/false)");
		maiorDeIdade = sc.nextBoolean();
		System.out.println(maiorDeIdade ? "Seja bem-vindo(a)!" : "Proibido entrar");
		sc.close();
	}

}
