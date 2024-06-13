package br.com.logica;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.println("Insira um número: ");
		num1 = sc.nextInt();
		sc.close();
		int count = 0;
		int resultado = 0;
		while(count <= 10) {
			resultado = num1 * count;
			System.out.println(num1 + " * " + count + " = " + resultado);
			count ++;
		}	
	}
}
