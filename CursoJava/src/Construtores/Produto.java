package Construtores;

public class Produto {
	
	private String data;	
	private String nome;
	private float preco;
	private int quantidade;
	

	
	public Produto(String data, String nome, float preco, int quantidade) {
		super();
		this.data = data;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public void setName(String nome) {
		this.nome =nome;
	}
	public String getName() {
		return nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
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
		//converte os objetos em String
		
		return nome+" $"+String.format("%.2f", preco)+" Quantidade:"+quantidade+" data:"+data+" Total de caixa:"+String.format(" %.4f", precoTotal());	
	}
	
	
}