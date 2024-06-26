package app;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		
		
		System.out.println("Entre com os dados do produto: ");
		System.out.println("Nome: ");
		produto.nome = sc.nextLine();
		System.out.println("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto" + produto.toString());
		
		System.out.println();
		System.out.println("Informe a quantidade de produtos que você quer adicionar: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados do produto: " + produto.toString());
		
		System.out.println();
		System.out.println("Informe a quantidade de produtos que você quer remover: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados do produto: " + produto.toString());
		
		sc.close();
		
	}

}
