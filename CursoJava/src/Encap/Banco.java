package Encap;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        Scanner sq = new Scanner(System.in); // Criar um novo scan fasse necessario para inserir novas variaveis digitadas pelo usuario e comparalas
        int id;
        while (true) {
       
        	try {
        		 System.out.println("Bem vindo a sua Conta bancaria");
        	        System.out.println("Seu id:");
        	        String number = sc.next();
        	        id = Integer.parseInt(number);
        	        
        	        sc.nextLine();//Usuario da um espaçamento
        		break;
        		
        	}catch (NumberFormatException e) {
				// TODO: handle exception
        		System.out.println("O numero digitado não é valido");
        		
			}
        }

        System.out.println("Seu nome titular:");
        String nomeTitular = sc.nextLine();
        float saldo = 0;

        System.out.println("Deseja efetuar um depósito (s/n): ");
        String ars = sc.nextLine();

        Conta cont = new Conta(id, nomeTitular, saldo);
        
        if (ars.equals("s")) {
            System.out.println("Digite o valor a ser depositado: ");
            float number;
            while (true) {
            	try {
            	String depositoInicial = sc.next();
            	number = Float.parseFloat(depositoInicial);
                cont.addDeposito(number);
                 break;
                 
            	}catch (NumberFormatException e) {
					// TODO: handle exception
            		System.out.println("Valor digitado não corresponde um numero valido\n");
            		System.out.println("Digite o valor a ser depositado: ");
            		 
				} 
            }
        }
        System.out.println("Deseja sacar um valor (s/n)?");
        System.out.println("Temos uma taxa de R$5,00 por saque");
        String l = sq.nextLine();
        
        if (l.equals("s")) {
        	float number;
        	while (true) {
            	try {
            System.out.println("Digite o valor a ser sacado: ");
            String saque = sc.next();
            number = Float.parseFloat(saque);
            cont.fazSaque(number);
            break;
        }catch (NumberFormatException e) {
			// TODO: handle exception
        	System.out.println("Valor digitado não corresponde um numero valido\n");
    		System.out.println("Digite o valor a ser sacado: ");
		}
            	}
        }
        System.out.println(cont);
        
        sc.close();
    }
}
