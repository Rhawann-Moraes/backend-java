package br.com.logica;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o tamanho do vetor: ");
		int n = sc.nextInt();
		int numbers [] = new int [n];
		sc.close();
		for(int i=0; i < n; i++)
		{
			numbers[i] = i+3 ;
			System.out.println(numbers[i]);
		}

	}

}