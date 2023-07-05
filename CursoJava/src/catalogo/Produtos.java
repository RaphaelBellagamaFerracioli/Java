package catalogo;

public class Produtos {
	
	public String data;	
	public String nome;
	public float preco;
	public int quantidade;
	
	
	
	public Produtos() {
		super();
		this.data = data;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public float precoTotal() {
		float resultado = quantidade * preco;		
		return resultado;
	}
	public void addProd(int quantidade) {
		this.quantidade += quantidade;
	}
	public void RemoveProd(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		//faz uma subscrição no campo nome
		
		return nome+" $"+String.format("%.2f", preco)+" Quantidade:"+quantidade+" data:"+data+" Total de caixa:"+String.format("\n %.4f", precoTotal());	
	}
	
	
}
