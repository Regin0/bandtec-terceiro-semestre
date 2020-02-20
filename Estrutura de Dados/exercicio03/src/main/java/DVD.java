public class DVD extends Produto {

    private String nome;
    private String gravadora;

    public DVD(int codigo, Double precoCusto, String descricao, String nome, String gravadora) {
        super(codigo, precoCusto, descricao);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public double getValorVenda() {
        return getValorVenda() *1.2;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "nome='" + nome + '\'' +
                ", gravadora='" + gravadora + '\'' +
                ", valorVenda=" + getValorVenda() +
                "} " + super.toString();
    }
}
