package br.com.logica;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i <= 10; i++) {
			int x = n * i;
			System.out.println(n + " * " + i + " = " + x);
		}
		sc.close();
	}
}
