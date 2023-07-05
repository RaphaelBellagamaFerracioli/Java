package Farmacia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat data = new SimpleDateFormat("dd/mm/yyyy");
		
		System.out.println("--------------------------------------------\n");
		System.out.println("Entre com o nome do cliente: ");
		String nome = sc.nextLine();
		
		System.out.println("Entre com o email do cliente: ");
		String email = sc.nextLine();
		
		System.out.println("Entre com a data de nacimento do cliente: ");
		Date aniversario = data.parse(sc.next());
	}

}
