package br.com.logica;

import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número que você quer descobrir"
				+ "se o sexto bit é verdadeiro ou falso: ");
		int n = sc.nextInt();
		int mask = 0b1000000;
		
		if((n & mask) != 0)
		{
			System.out.println("O sexto bit é verdadeiro");
		}
		else
		{
			System.out.println("O sexto bit é falso");
		}
		
		sc.close();
	}

}
