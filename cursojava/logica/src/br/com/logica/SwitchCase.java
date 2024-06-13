package br.com.logica;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		System.out.println("Seja bem vindo(a)!");
		System.out.println("Escolha seu lanche");
		System.out.println("(1)Cachorro quente");
		System.out.println("(2)Hamburguer");
		System.out.println("(3)Espaguete");
		System.out.println("(4)Churrasquinho");
		opcao = sc.nextInt();
		switch(opcao) {
		case 1: 
			System.out.println("Seu Cachorro quente já está sendo preparado."
					+ "Obrigado pela preferência e volte sempre! ");
			break;
		case 2: 
			System.out.println("Seu Hamburguer quente já está sendo preparado."
					+ "Obrigado pela preferência e volte sempre! ");
			break;
		case 3: 
			System.out.println("Seu Espaguete quente já está sendo preparado."
					+ "Obrigado pela preferência e volte sempre! ");
			break;
		case 4: 
			System.out.println("Seu Churrasquinho já está sendo preparado."
					+ "Obrigado pela preferência e volte sempre! ");
			break;
		default:
			System.out.println("Opção inválida!");
			
		}
		sc.close();
		
		
	}

}
