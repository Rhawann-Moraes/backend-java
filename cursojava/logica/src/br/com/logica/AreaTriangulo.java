package br.com.logica;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class AreaTriangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC, areaX, alturaX, areaY, alturaY;
		System.out.println("Entre com os valores dos lados do triângulo X: ");
		
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Entre com os valores dos lados do triângulo X: ");
		
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		alturaX = (xA + xB + xC)/2;
		alturaY = (yA + yB + yC)/2;
		
		areaX = Math.sqrt(alturaX*(alturaX - xA)*(alturaX - xB)*(alturaX - xC));
		System.out.println("A medida dos lados do triangulo são: lado a: " +  xA + "|lado b: " + xB
				+ "|23lado c: " + xC);
		System.out.printf("A altura do triangulo X é: %.4f%n", alturaX);
		System.out.printf("A área do triangulo X é: %.4f%n", areaX);
		areaY = Math.sqrt(alturaY*(alturaY - yA)*(alturaY - yB)*(alturaY - yC));
		System.out.println("A medida dos lados do triangulo Y são: lado a: " +  yA + "|lado b: " + yB
				+ "|lado c: " + yC);
		System.out.printf("A altura do triangulo Y é: %.4f%n", alturaY);
		System.out.printf("A área do triangulo Y é: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("O triangulo X tem uma área maior do que o triângulo Y.");
		}else {
			System.out.println("O triangulo Y tem uma área maior do que o triângulo X.");
		}
		
		
		sc.close();
	
	}

}
