package Construtores;

import java.util.Locale; 
import java.util.Scanner;

import Construtores.Produto;

public class Const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a data de fabricacao: ");
		String data = sc.next();
		
		System.out.println("Digite o nome do produto: ");
		String nome = sc.next();
		
		System.out.println("Digite o preco do produto: ");
		float preco = sc.nextFloat();
		
		System.out.println("Digite a quantidade de produtos em estoque: ");
		int quantidade = sc.nextInt();
		
		Produto product = new Produto(data,nome,preco,quantidade);
		
		//faz a alteração do nome
		product.setName("Computador");
		
		float precoProd = product.precoTotal();
		//agora ele já entende o product sem definição como to String que retorna tudo dentro da função to string
		
		System.out.println("Nome : "+ product);
		
		System.out.println("\nEntre com o numero de produtos para ser adicionado no estoque: ");
		int quantity = sc.nextInt();
		product.addProd(quantity);
		
		System.out.println("\nEntre com o numero de produtos para serem removidos do estoque: ");
		quantity = sc.nextInt();
		product.RemoveProd(quantity);
		
		
		System.out.println("\nO preco todos os produtos no estoque: "+ precoProd);
		System.out.println("\nO produto:"+ product.getName() +", "+"Preco: "+ product.getPreco() +", "+"Quatidade: "+ product.getQuantidade());
	}

}
