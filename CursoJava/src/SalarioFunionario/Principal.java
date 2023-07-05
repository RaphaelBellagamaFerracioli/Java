package SalarioFunionario;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Scanner sp = new Scanner(System.in);
		
		int f = 999999;
		System.out.println("Salario dos funcionarios do Trem fantasma");

		System.out.println("Digite quantos funcionarios deseja cadastrar: ");
		int n = sc.nextInt();
		
		boolean[] id_full = new boolean[f];
		
		Ficha[] ficha = new Ficha[n];
		
		for (int i =0;i<ficha.length; i++) {

		System.out.println("Entre com a id do funcionario: ");// id é o unico elemento que não pode repetir
		int id = sc.nextInt();
		

        while (id >= id_full.length || id_full[id]) {
            
        	System.out.println("Desculpe, este id já está sendo usado escolha outro ");

            System.out.println("\nEntre com a id do funcionário: "); // id é o único elemento que não pode repetir
            id = sc.nextInt();
        }
        
        id_full[id] = true;
		
		System.out.println("Entre com o nome do funcionario: ");
		String nome = sc.nextLine();
		
		System.out.println("Entre com o salario do funcionario: ");
		float salario = sc.nextFloat();

		ficha[i] = new Ficha(id,nome, salario);
		}

		System.out.println("Deseja aumentar o salario de uma funcionario (s/n) ");
		String escolha = sc.next();
		
		if(escolha.equals("s")) {
			
			System.out.println("Digite o id do funcionario: ");
			int codigofun = sc.nextInt();
				
			for (int i =0; i <ficha.length;i++) {
				
				if(codigofun == ficha[i].getId()) {
					
					System.out.println("Digite o aumento em portentagem que deseja dar para o funcionario: ");
					float aumento = sc.nextFloat();
					ficha[i].addsalario(aumento);
					
				}
				
			}
		}
		//Todos os funcionarios
				for (int i =0;i<ficha.length;i++) {
					System.out.println("\nFuncionario "+(i+1));
					System.out.println("Nome: "+ficha[i].getNome());
					System.out.println("ID: "+ficha[i].getId());
					System.out.println("Salario: "+ficha[i].getSalario());
					
				}
		
	}

}
