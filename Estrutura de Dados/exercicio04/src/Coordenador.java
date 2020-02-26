public class Coordenador implements Bonus {

    private String nome;
    private double coordenacaoPorSemana;
    private double valorCoord;

    public Coordenador(String nome, double coordenacaoPorSemana, double valorCoord) {
        this.nome = nome;
        this.coordenacaoPorSemana = coordenacaoPorSemana;
        this.valorCoord = valorCoord;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCoordenacaoPorSemana() {
        return coordenacaoPorSemana;
    }

    public void setCoordenacaoPorSemana(double coordenacaoPorSemana) {
        this.coordenacaoPorSemana = coordenacaoPorSemana;
    }

    public double getValorCoord() {
        return valorCoord;
    }

    public void setValorCoord(double valorCoord) {
        this.valorCoord = valorCoord;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "nome='" + nome + '\'' +
                ", coordenacaoPorSemana=" + coordenacaoPorSemana +
                ", valorCoord=" + valorCoord +
                ", bonus="+ getValorBonus() +
                '}';
    }

    @Override
    public double getValorBonus() {
        return coordenacaoPorSemana * valorCoord;
    }
}
