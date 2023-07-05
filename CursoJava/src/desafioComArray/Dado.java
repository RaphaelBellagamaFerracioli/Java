package desafioComArray;

class Dado {

    private String nome;
    private String email;
    private int RegistroEstudante;
    private float aluguel;

    public Dado(String nome, String email, int registroEstudante, float aluguel) {
        super();
        this.nome = nome;
        this.email = email;
        this.RegistroEstudante = registroEstudante;
        this.aluguel = aluguel;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected int getRegistroEstudante() {
        return RegistroEstudante;
    }

    protected void setRegistroEstudante(int registroEstudante) {
        this.RegistroEstudante = registroEstudante;
    }

    protected float getAluguel() {
        return aluguel;
    }

}