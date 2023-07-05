package ExercisioNumerodSegundaTentativa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Produto p = new Produto("TV", 1000.0);
		
		OrderItem oi1 = new OrderItem(1, 1000.0, p);
		
		System.out.println(oi1.getProduct().getName()+"\n");
		// usando o get Product posso retornar todos os valores dentro dele
		
		System.out.println(oi1);
		
		Client cli = new Client("Maria", "gabiel4k12@gmail.com",sdf.parse("20/05/2000"));
		
		System.out.println(cli);
		
		System.out.print("\n------------Enter client data----------\n");
		
		System.out.println("Name: ");
		String name = scan.nextLine();
		System.out.print("Email: ");
		String email = scan.next();
		System.out.print("Birth date (DD/MM/YYYY): ");//sua data de aniversario
		Date birthDate = sdf.parse(scan.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(scan.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		
		int N = scan.nextInt();
		for (int i=1; i<=N; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			scan.nextLine();
			String productName = scan.nextLine();
			System.out.print("Product price: ");
			double productPrice = scan.nextDouble();
			System.out.print("Quantity: ");
			int quantity = scan.nextInt();
			
			Produto product = new Produto(productName, productPrice);
			
			OrderItem it = new OrderItem(quantity, productPrice, product);
			
			order.addItem(it);			
		}
		System.out.println();
		System.out.println(order);
		
		scan.close();
	}

}
