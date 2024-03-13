package estoque;

import java.util.Locale;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		Produtos produtos = new Produtos();
		System.out.println("Insirar seu produto");
		
		System.out.println("Insirar o nome:");
		produtos.nome = sc.nextLine(); 
		
		System.out.println("Preço:");
		produtos.price = sc.nextDouble();
	
		System.out.println("Insirar a quantidade do estoque:");
		produtos.quantity = sc.nextInt();
		
		//Essa é formar não resumida do codigo;
		/*System.out.println(produtos.nome +"," + produtos.price + "," + produtos.quantity);*/
		
		System.out.println("Produto: "+ produtos);
		
		System.out.println();
		System.out.println("Insira uma quantidade de produtos para adicionar: ");
		int quantity = sc.nextInt();
		produtos.addProdutos(quantity);
		
		System.out.println();
		System.out.println("Atualizado: " + produtos);
		
		System.out.println();
		System.out.println("Insira uma quantidade de produtos para remover: ");
		quantity = sc.nextInt();
		produtos.removeProdutos(quantity);
		
		System.out.println();
		System.out.println("Atualizado: " + produtos);
		
	sc.close();
	}

}
