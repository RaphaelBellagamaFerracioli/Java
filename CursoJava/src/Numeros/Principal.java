package Numeros;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n =0;
		
		while(true) {
			System.out.println("Digite quantos numeros deseja digitar: ");
			n = sc.nextInt();
			if (n <=10 && n >0) {
				break;
			}else {
				System.out.println("Digite um numero maior que zero e menor que 10");
			}
		}
		Number[] num = new Number[n];
		//Insere os valores dentro do array
		for(int i=0; i<num.length; i++) {
			System.out.println("Digite o numero: ");
			float number = sc.nextFloat();
			num[i]= new Number(number);	
		}
		
		for(int i=0; i<num.length;i++) {
			//Mostra todos os numeros lidos
			System.out.println("Numero "+(i+1)+": "+num[i].getNumero());
			
		}
		//Mostra todos os numeros negativos
		System.out.println("\nnumeros Negativos");	
			for(int i=0; i<num.length;i++) {
				//Mostra todos os numeros negativos
				if (num[i].getNumero() <0) {
					
					System.out.println("Numero "+i+1+": "+num[i].getNumero());
				}
		}
			//Mostra todos os numeros positivos
			System.out.println("\nnumeros Positivos");	
				for(int i=0; i<num.length;i++) {
					//Mostra todos os numeros negativos
					if (num[i].getNumero() >=0) {
						
						System.out.println("Numero "+i+1+": "+num[i].getNumero());
					}
			}
	}

}
