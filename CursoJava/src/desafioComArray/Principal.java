package desafioComArray;

import java.util.Scanner;


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.println("=======Hotel Silent=======\n");

        System.out.println("Digite o numero de estudantes querem alugar quartos: ");
        int n = sc.nextInt();

        while (true) {
            if (n < 0 || n > 10) {
                System.out.println("O numero de estudantes deve ser maior que zero e menor que 10");
                n = sc.nextInt();
            } else {
                break;
            }
        }

        Dado[] date = new Dado[n];
        boolean[] quarto = new boolean[10];

        for (int i = 0; i < date.length; i++) {
        	System.out.println("\nCliente "+(i+1));
            System.out.println("Digite o nome do Estudante:");
            String nome = sc.next();

            System.out.println("Digite o email do Estudante:");
            String email = sc.next();

            System.out.println("Digite o quarto do Estudante:");
            int NumeroDoquarto = sc.nextInt();

            while (quarto[NumeroDoquarto]) { //faz a verificação se o numero do quarto já foi reservado
                System.out.println("Desculpe, este quarto já está reservado. Por favor escolha outro quarto.");
                NumeroDoquarto = sc.nextInt();
            }

            quarto[NumeroDoquarto] = true;

            System.out.println("Digite o Aluguel do Estudante:");
            float aluguel = sc.nextFloat();

            date[i] = new Dado(nome, email, NumeroDoquarto, aluguel);
        }

        
        for (int i = 0; i < 10; i++) {
        	
        			System.out.println("\nCliente: " + (i + 1));
                    System.out.println("Nome: " + date[i].getNome());
                    System.out.println("Email: " + date[i].getEmail());
                    System.out.println("Aluguel: " + date[i].getAluguel());
                    System.out.println("Numero De qaurto: " + date[i].getRegistroEstudante());
                    
        		
        	}
            

        }
    }
