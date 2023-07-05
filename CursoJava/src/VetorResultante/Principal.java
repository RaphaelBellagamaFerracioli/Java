package VetorResultante;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite aqui quantos numeros deseja somar: ");
		int n = sc.nextInt();
		
		Vetor[] vet = new Vetor[n];
		
		for (int i=0;i<vet.length;i++) {
			
			
			System.out.println("Digite o primeiro numero: ");
			float numberA = sc.nextFloat();
			
			System.out.println("Digite o segundo numero: ");
			float numberB = sc.nextFloat();
			
			float SomaElementos = numberA+numberB;
			
			vet[i] = new  Vetor(numberA, numberB,SomaElementos);
			
		}
		System.out.println("\n\n");
		System.out.println("Valores Digitados");
		
		for (int i=0; i<vet.length;i++) {
			System.out.println("Primeiro Valor: "+vet[i].getNumeroA());
			System.out.println("Segundo Valor: "+vet[i].getNumeroB());
			
		}
		
		System.out.println("Soma dos valores");
		for (int i=0; i<vet.length;i++) {
			System.out.println("Soma "+(i+1)+": "+vet[i].getNumeroC());
			
		}

	}
	
}
