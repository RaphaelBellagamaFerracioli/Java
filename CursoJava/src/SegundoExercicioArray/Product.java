package SegundoExercicioArray;

public class Product {

	private String nome;
	private double idade;
	private double altura;
	public Product(String nome, double idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected double getIdade() {
		return idade;
	}
	protected void setIdade(double idade) {
		this.idade = idade;
	}
	protected double getAltura() {
		return altura;
	}
	protected void setAltura(double altura) {
		this.altura = altura;
	}
	

	
	
}
