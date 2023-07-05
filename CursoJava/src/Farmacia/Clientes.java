package Farmacia;

import java.util.Date;

public class Clientes {

	private String nome;
	private String email;
	private Date aniversario;
	
	
	public Clientes(String nome, String email, Date aniversario) {
		super();
		this.nome = nome;
		this.email = email;
		this.aniversario = aniversario;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getAniversario() {
		return aniversario;
	}
	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}
	
}
