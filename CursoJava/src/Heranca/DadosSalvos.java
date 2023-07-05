package Heranca;

public class DadosSalvos extends Conta{

	private Double interes;//taxa de juros
	
	public DadosSalvos() {
		super();
		
	}

	public DadosSalvos(int number, String holder, double balance, Double interes) {
		super(number, holder, balance);
		this.interes = interes;
	}

	public Double getInteres() {
		return interes;
	}

	public void setInteres(Double interes) {
		this.interes = interes;
	}
	
	public void updateBalance() {
		
	balance += balance * interes;
	}
	
	
}
