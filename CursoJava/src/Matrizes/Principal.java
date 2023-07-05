package Matrizes;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da matriz: ");
		int n = sc.nextInt();
		
		int [][] mat = new int[n][n];
		
		for(int i=0 ; i<n;i++) {
			for(int j=0; j<n;j++) {
				
				mat[i][j] =sc.nextInt();
			}
		}
		System.out.println("Matriz diagonal: ");
		for (int i=0 ;i<n;i++ ) {
			System.out.print(mat[i][i]+" ");
		}
		
		//imprime a matriz
		
		System.out.println("\nMatriz \n");
		
		for(int i=0 ; i<n;i++) {
			for(int j=0; j<n;j++) {		
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}
		
		//Pezquiza na matriz
		
		System.out.println("\nMatriz search \n");
		int var =0;
			for(int i=0 ; i<n;i++) {
				for(int j=0; j<n;j++) {		
					var = mat[1][0];
				
			}
			
			}
			System.out.println(""+var);
		sc.close();
		
	
	}
}
