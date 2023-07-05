package TiposPrimitivosDic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int x = 20;
//		
//		Object obj = x;
//		
//		System.out.println(obj);
//		
//		int y = (int)obj; 
//		
//		System.out.println(y);
		
		String[] vect = new String[] {"Maria","Lucas","Luiz"};
		
		for (int i=0; i<vect.length;i++) {
			
			System.out.println(vect[i]);
		}
		System.out.println("----------------------");
		//percorre todos os valores dentro do dicionario
		for(String obj : vect) {
			
			System.out.println(obj);
		}
		//devemos instanciar a lista
		
		List<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Jo�o");
		list.add("Alex");
		list.add("Rafel");
		list.add("Amiltom");
		list.add("James");
		
		//especifica a posisao que a variavel ser� inserida
		list.add(0, "Lucas");
		
		System.out.println("=========================");
		for(String obj : list ) {
			
			System.out.println(obj);
		}
		
		System.out.println("O tamanho da lista "+ list.size());
		
		
		list.remove(1);//remove pela posi��o
		
		list.removeIf(obj -> obj.charAt(0) == 'L');//remove todos que come�am com M
		
		//aspas simples s�o usadas para representar um unico caractere em java
		
		//pesquiza na lista
		System.out.println("----------------------");
		
		System.out.println("Pesquiza 1: "+list.indexOf("Jo�o"));//pesquiza o elemento e retorna a posiss�o do mesmo caso n�o encontre acha -1
		
		System.out.println("----------------------");
		
		List<String> result = list.stream().filter(obj -> obj.charAt(0) == 'J').collect(Collectors.toList());
		//Joga o result para dentro de uma lista depois compara de acha 
		//a um algum item com J do primeiro elemnto da lista, depois torna a converter para String novamente
		
		
		System.out.println("----------------------");
		String name = list.stream().filter(obj -> obj.charAt(0) == 'A').findFirst().orElse(null);
		// caso ele n�o entre ele retorna nulo
		
		System.out.println("Nome: "+name);
		
		for(String obj : result ) {
			
			System.out.println(obj);
		}
		
		System.out.println("=========================");
		
		for(String obj : list ) {
			
			System.out.println(obj);
		}
		
	}

}
