package ArayFrist;

import java.util.ArrayList;

public class Produto {
		
		  private ArrayList<Date> dates;

		    public Produto() {
		    	dates = new ArrayList<>();
		    }

		    public void adicionarPessoa(Date date) {
		    	dates.add(date);
		    }

		    public void removerPessoa(Date date) {
		    	dates.remove(date);
		    }
		    @SuppressWarnings("unlikely-arg-type")
			public void pesquizarPessoa(Date date) {
		    	dates.equals(date);
		    }

		    public void exibirPessoas() {
		    	
		        for (Date date : dates) {
		            System.out.println("Nome: " + date.getNome());
		            System.out.println("Idade: " + date.getIdade());
		            System.out.println("Endereço: " + date.getEndereco());
		            System.out.println();
		        }

	
	}
}
