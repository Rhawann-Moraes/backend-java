package pricipal;

import java.util.Scanner;
import utilitarios.ConversorMoeda;

public class AppConversor {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em dólares: ");
        double valorDolar = sc.nextDouble();
        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = sc.nextDouble();
        
        double valorEmReais = ConversorMoeda.converter(valorDolar, cotacaoDolar);
        
        System.out.printf("Valor necessário em reais: %.2f%n", valorEmReais);

        sc.close();
    }
}