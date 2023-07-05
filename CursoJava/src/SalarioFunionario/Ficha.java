package SalarioFunionario;

import ArayFrist.Date;

public class Ficha {
	
	private int id;
	private String nome;
	private float salario;
	
	public Ficha(int id, String nome, float salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected float getSalario() {
		return salario;
	}
	protected void setSalario(float salario) {
		this.salario = salario;
	}
	
	protected void addsalario(float aumento) {
        this.salario += (this.salario * aumento) / 100;
		
	}
	
}	
