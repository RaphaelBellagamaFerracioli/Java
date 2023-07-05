package Heranca;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Mostre aqui O resultado da conta	\n");
		
		Conta cont = new Conta(1005, "Lucas",0.0);
		
		NegocioConta bac = new NegocioConta(1002, "Maria",0.0,500.0);
		
		//upcasting
		Conta acc1 = bac;
		Conta acc2 = new NegocioConta(1003, "João",0.0,500.0);
		
		Conta acc3 = new DadosSalvos(1002, "Anna",0.0,0.01);
		acc1.getBalance();
		
		//downCasting
		
		NegocioConta acc4 =  (NegocioConta)acc2;
		acc4.loan(100.0);
		
		//NegocioConta acc5 = (NegocioConta)acc3;
		
		if(acc3 instanceof NegocioConta) {
			NegocioConta acc5 = (NegocioConta)acc3;
			acc5.loan(200.0);
			System.out.println("Loan");
		}
		
		if(acc3 instanceof DadosSalvos) {
			DadosSalvos acc5 = (DadosSalvos)acc3;
			acc5.updateBalance();
			System.out.println("\nUpdate");
		}
		
		
	}

}
