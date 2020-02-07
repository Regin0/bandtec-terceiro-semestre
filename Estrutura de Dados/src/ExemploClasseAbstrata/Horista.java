package ExemploClasseAbstrata;

public class Horista extends Funcionario {

    //Atributos
    private int qtdHoras;
    private double valorHora;

    //Construtor
    public Horista(String nome, String cpf, int qtdHoras, double valorHora) {
        super(nome, cpf);
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    //Métodos
    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    //Método calcSalario()
    @Override
    public double calcSalario() {
        return qtdHoras*valorHora;
    }

    //Método toString()
    @Override
    public String toString() {
        return "Horista{" +
                "qtdHoras=" + qtdHoras +
                ", valorHora=" + valorHora +
                ", salário=" + calcSalario() +
                "} " + super.toString();
    }
}
