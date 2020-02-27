public class Acionista implements Funcionario {

    private String nome;
    private int qtdAcoes;
    private double precoAcoes;

    public Acionista(String nome, int qtdAcoes, double precoAcoes) {
        this.nome = nome;
        this.qtdAcoes = qtdAcoes;
        this.precoAcoes = precoAcoes;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdAcoes() {
        return qtdAcoes;
    }

    public double getPrecoAcoes() {
        return precoAcoes;
    }

    @Override
    public double getValorBonus() {
        return qtdAcoes * precoAcoes * 0.20;
    }

    @Override
    public String toString() {
        return "Acionista{" +
                "nome='" + nome + '\'' +
                ", qtdAcoes=" + qtdAcoes +
                ", precoAcoes=" + precoAcoes +
                ", totalBonusGanho" + getValorBonus() +
                '}';
    }
}
