package ExercicioNumerado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub

		SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome do departamento: ");
		String nomeDepartamento = scanner.nextLine();
		
		System.out.println("Entre com os dados do trabalhador");
		
		System.out.println("Entre com o nome do funcionario: ");
		System.out.print("Nome: ");	
		
		String nome = scanner.nextLine(); 
		
		System.out.println("Entre com o nivel do funcionario: ");
		System.out.print("Nivel: "); String workLevel = scanner.nextLine(); 
		
		System.out.println("Entre com o salario base do funcionario: ");
		System.out.print("Salario: ");
		
		double baseSalario = scanner.nextDouble(); 
		
		Trabalho tra = new Trabalho(nome, NivelDetrabalho.valueOf(workLevel), baseSalario, new Departamento(nomeDepartamento));
		
		System.out.println("Quantos contratos deseja fazer: ");
		
		int n = scanner.nextInt();
		
		for (int i =1; i<=n;i++) {
			System.out.println("Entre com o contrato #"+i+" data:");
			System.out.println("Date (DD/MM/YYYY): ");
			
			Date contractdate = sdf.parse(sc.next());
			
			System.out.println("Entre com o valor da hora: ");
			double valueHor = scanner.nextDouble();
			
			System.out.println("Entre com a duração em horas: ");
			int duracao = scanner.nextInt();
			HoraContrato contract = new HoraContrato(contractdate, valueHor, duracao);
			tra.addContract(contract);
		}
		
		System.out.println("");
		System.out.println("Pezquize um contrato");
		System.out.println("Entre com o mes e o ano (MM/YYYY): ");
		String monthAndYer = scanner.next();
		int month = Integer.parseInt(monthAndYer.substring(0, 2));
		int year = Integer.parseInt(monthAndYer.substring(3));
		
		System.out.println("Nome: "+tra.getName());
		System.out.println("Departamento: "+tra.getDepartament().getName());
		
		System.out.println("Na data : "+ monthAndYer+": "+String.format("%.2f", tra.income(year, month)));
		
		scanner.close();
	}

}
