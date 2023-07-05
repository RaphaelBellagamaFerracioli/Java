package VetorResultante;

public class Vetor {
	
	private float numeroA;
	private float numeroB;
	private float numeroC;
	
	public Vetor(float numeroA, float numeroB, float numeroC) {
		super();
		this.numeroA = numeroA;
		this.numeroB = numeroB;
		this.numeroC = numeroC;
	}
	protected float getNumeroA() {
		return numeroA;
	}
	protected void setNumeroA(float numeroA) {
		this.numeroA = numeroA;
	}
	protected float getNumeroB() {
		return numeroB;
	}
	protected void setNumeroB(float numeroB) {
		this.numeroB = numeroB;
	}
	protected float getNumeroC() {
		return numeroC;
	}
	protected void setNumeroC(float numeroC) {
		this.numeroC = numeroC;
	}
	
	
	
}
