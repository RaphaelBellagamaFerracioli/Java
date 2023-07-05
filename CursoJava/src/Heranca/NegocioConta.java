package Heranca;

public class NegocioConta extends Conta{

	
	private double loanLimit;
	
	public NegocioConta() {
		
	}//construtor padrão da classse

	public NegocioConta(int number, String holder, double balance, double loanLimit) {
		super(number, holder, balance);//chama os atributos da superclasse ou classe estendida
		this.loanLimit = loanLimit;
	}
	
	
	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}
	

	public void loan(double amount) {
		if (amount <= loanLimit) {
		deposit(amount);
	}
		
	}
}
