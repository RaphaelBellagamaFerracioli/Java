package catalogo;

import java.util.Scanner;

import Triangulo.TrianguloRec;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Produtos product = new Produtos();
		
		System.out.println("Digite a data de fabricacao: ");
		product.data = sc.next();
		
		System.out.println("Digite o nome do produto: ");
		product.nome = sc.next();
		
		System.out.println("Digite o preco do produto: ");
		product.preco = sc.nextFloat();
		
		System.out.println("Digite a quantidade de produtos em estoque: ");
		product.quantidade = sc.nextInt();
		
		float precoProd = product.precoTotal();
		//agora ele j� entende o product sem defini��o como to String que retorna tudo dentro da fun��o to string
		System.out.println("Nome : "+ product);
		
		System.out.println("\nEntre com o numero de produtos para ser adicionado no estoque: ");
		int quantity = sc.nextInt();
		product.addProd(quantity);
		
		System.out.println("\nEntre com o numero de produtos para serem removidos do estoque: ");
		quantity = sc.nextInt();
		product.RemoveProd(quantity);
		
		
		System.out.println("\nO preco todos os produtos no estoque: "+ precoProd);
		
		System.out.println("\nO produto:"+ product.nome +", "+"Preco: "+ product.preco +", "+"Quatidade: "+ product.quantidade);
		
	}

}
