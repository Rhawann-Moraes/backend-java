package br.com.logica;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioEntradaDeDados {

	public static void main(String[] args) {
		//Faça um programa para ler dois valores inteiros, e depois mostrar
		//na tela a soma desses números com uma 
		//mensagem explicativa, conforme exemplos.
		
		int number1, number2, soma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Exercício 1");
		System.out.println("Insira o primeiro número: ");
		number1 = sc.nextInt();
		System.out.println("Insira o segundo número: ");
		number2 = sc.nextInt();
		
		soma = number1 + number2;
		System.out.println("Primeiro número: " + number1 + ".");
		System.out.println("Segundo número: " + number2 + ".");
		System.out.println("O resultado da soma entre " + number1 + " + "
		+ number2 + " = " + soma);
		
	//--------------------------------
		/*Faça um programa para ler o valor do raio de um círculo,
		e depois mostrar o valor da área deste círculo com quatro 
		casas decimais conforme exemplos.*/
	
		System.out.println("Exercício 2");
		Locale.setDefault(Locale.US);
		double raio, area;
		double pi = 3.14159;
		System.out.println("Insira o valor do raio do círculo: ");
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2);
		System.out.printf("O Valor da área do círculo"
				+ " com o raio = %.2f é: %.4f%n", raio, area);	
		
		sc.close();
	}

}
