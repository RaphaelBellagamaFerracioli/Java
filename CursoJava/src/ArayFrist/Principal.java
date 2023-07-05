package ArayFrist;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    	
        Produto prod = new Produto();
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de pessoas a serem cadastradas: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o endereço da pessoa: ");
            String endereco = scanner.nextLine();

            prod.adicionarPessoa(new Date(nome, idade, endereco));
            
            System.out.println("Deseja remover essa pessoa (s/n): ");
            String remove = sc.next(); 
            
            if (remove.equals("s")) {
                prod.removerPessoa(new Date(nome, idade, endereco));
            }
   
        }
        prod.exibirPessoas();
    }
}