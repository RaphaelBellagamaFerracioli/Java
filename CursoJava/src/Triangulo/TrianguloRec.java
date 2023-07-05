package Triangulo;

public class TrianguloRec {

	public double a;
	public double b;
	public double c;
	
	public double area() {
		
		double p =(a+b+c)/2;
		
		double resultado = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return resultado;
	}
	
}
