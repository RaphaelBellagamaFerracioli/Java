package Alunos;

import java.util.Locale;
import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Notas nota = new Notas();
		
		System.out.println("Digite o nome do aluno: ");
		nota.nome = sc.next();
		System.out.println("Digite a primeira nota do aluno: ");
		nota.nota1 = sc.nextFloat();
		
		System.out.println("Digite a segunda nota do aluno: ");
		nota.nota2 = sc.nextFloat();
		
		System.out.println("Digite a terceira nota do aluno: ");
		nota.nota3 = sc.nextFloat();
		
		System.out.println("A média das notas será de "+ nota.media());
		System.out.println("O aluno está :"+nota.aprovacao()+", "+"Para a aprovação falta:"+ nota.faltante());
		
		String res = sc.next();
		String n = nota.recebe(res);
		System.out.println("Valor de n:"+n);
		
	}

}
