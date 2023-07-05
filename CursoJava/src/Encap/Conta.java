package Encap;

class Conta {
    private int id;
    private String nomeTitular;
    protected float saldo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Conta(int id, String nomeTitular, float saldo) {
        super();
        this.id = id;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;

    }

    public void addDeposito(float deposito) {
        this.saldo += deposito;
    }
    public void fazSaque(float saque) {
        this.saldo -= saque-5;
    }
    
    @Override
    public String toString() {
    	return "Conta " + id + ", Titular: " + nomeTitular + ", Saldo: $ " + String.format("%.2f", saldo);
    }
}
