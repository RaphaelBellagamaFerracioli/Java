package Alunos;

public class Notas {
		
	public	String nome;
	public float nota1;
	public float nota2;
	public float nota3;

	public float media(){
		float	resultado = (nota1+nota2+nota3)/3;	
		return resultado;
		
	}
	public String aprovacao() {
		String resultado;
		float n =0;
		if (((nota1+nota2+nota3)/3) <5) {
			 resultado = "Reprovado";
		}else {
			resultado ="Aprovado";
		}
		return resultado;
	}
	public  float faltante() {

		float resultado = (nota1+nota2+nota3)/3;
		if (resultado<5) {
			float falta = 5 - resultado;
			return falta;
		}else {
			return 0;
		}
	}
	public String recebe(String res) {
		
		
		return res;
	}
}
