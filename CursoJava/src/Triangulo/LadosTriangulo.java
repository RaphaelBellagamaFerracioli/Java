package Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class LadosTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		TrianguloRec x,y;
		
		
		x = new TrianguloRec();
		y = new TrianguloRec();
		
		System.out.println("Entre com os lados do triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com os lados do triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.b = sc.nextDouble();
		
		double areax = x.area();
		
		double areay = y.area();
		
		System.out.printf("A area do triangulo x: %.4f%n ",areax);
		
		System.out.printf("A area do triangulo y: %.4f%n ", areay);
		
		if(areax >areay) {
			System.out.printf("A area mais larga é: %.4f%n ", areax);
			
		}else {
			System.out.printf("A area mais larga é: %.4f%n ", areay);
		}
			
		
	}

}
