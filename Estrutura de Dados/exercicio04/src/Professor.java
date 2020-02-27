public class Professor implements Bonus {

    private String nome;
    private int aulaPorSemana;
    private double valorHoraAula;

    public Professor(String nome, int aulaPorSemana, double valorHoraAula) {
        this.nome = nome;
        this.aulaPorSemana = aulaPorSemana;
        this.valorHoraAula = valorHoraAula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAulaPorSemana() {
        return aulaPorSemana;
    }

    public void setAulaPorSemana(int aulaPorSemana) {
        this.aulaPorSemana = aulaPorSemana;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", aulaPorSemana=" + aulaPorSemana +
                ", valorHoraAula=" + valorHoraAula +
                ", bonus="+ getValorBonus() +
                '}';
    }

    @Override
    public double getValorBonus() {
        return aulaPorSemana * valorHoraAula * 4.5 * 0.15;
    }
}
