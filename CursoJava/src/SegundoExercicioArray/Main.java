package SegundoExercicioArray;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Numeros de vezes que serão guardados:");
		int n = sc.nextInt();
		//Define o tamanho do espaço a ser alocado
		
		Product[] vect = new Product[n];
		
		for(int i=0;i<vect.length;i++) {
			
			System.out.println("Escreva o nome:");
			
			String nome= sc.next();
			
			System.out.println("Escreva a altura:");
			double altura = sc.nextDouble();
			
			System.out.println("Escreva a idade:");
			double idade = sc.nextDouble();
			
			vect[i]= new Product(nome,altura,idade);
		}
		
		double SomaAltura = 0;
		for (int i=0; i<n;i++) {
			
			SomaAltura += vect[i].getAltura();
		}
		//|Lista os itens armazenados
		for (int j=0; j<n;j++) {
			System.out.println("\nNome: "+vect[j].getNome());
			System.out.println("Altura: \n"+vect[j].getAltura());
			System.out.println("idade: \n"+vect[j].getIdade());
		}
		double Media =SomaAltura/n;
		System.out.println("A media das alturas é: "+Media);
	
		System.out.println("Pessoas com menos de 16 anos");
		
		
		for (int i= 0; i<vect.length;i++) {
			if (vect[i].getIdade()<16) {
				System.out.println("\nNome: "+vect[i].getNome());
				System.out.println("idade: \n"+vect[i].getIdade());
			}
			
		}
		
	}

}
