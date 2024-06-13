package br.com.logica;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char gender;
		int age;
		String name;
		double height;
		System.out.println("Qual o seu nome?");
		name = sc.next();
		System.out.println("Qual o seu sexo F ou M?");
		gender = sc.next().charAt(0);
		System.out.println("Qual a sua idade?");
		age = sc.nextInt();
		System.out.println("Qual a sua altura?");
		height = sc.nextDouble();
		
		
		System.out.println("Nome: "+ name);
		System.out.println("Idade: " +age + " anos");
		System.out.println("Altura: "+ height);
		System.out.println("Sexo: " + gender);
		
		sc.close();
		
		
	}

}
