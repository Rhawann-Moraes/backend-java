package br.com.logica;

import java.util.Scanner;

public class Condicional {
	public static void main(String[] args) {
		int age;
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		name = sc.nextLine();
		System.out.println("Olá " + name + ", seja bem vindo(a)!");
		System.out.println("Digite sua idade: ");
		age = sc.nextInt();
		
		if(age < 18) {
			System.out.println("Não é permitido a entrada de menores de idade sem"
					+" o acompanhamento dos pais!");
		}else {
			System.out.println("Aproveite o filme e volte sempre!");
		}
		sc.close();
	}
}
