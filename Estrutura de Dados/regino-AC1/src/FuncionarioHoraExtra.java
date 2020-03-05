public class FuncionarioHoraExtra implements Funcionario{

    private int codigo;
    private String nome;
    private double salario;
    private double qtdHoraExtra;
    private double valorHoraExtra;

    public FuncionarioHoraExtra(int codigo, String nome, double salario, double qtdHoraExtra, double valorHoraExtra) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
        this.qtdHoraExtra = qtdHoraExtra;
        this.valorHoraExtra = valorHoraExtra;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getQtdHoraExtra() {
        return qtdHoraExtra;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    @Override
    public double getValorBonus() {
        return salario + (qtdHoraExtra * valorHoraExtra) * 0.15;
    }

    @Override
    public String toString() {
        return "FuncionarioHoraExtra{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                ", qtdHoraExtra=" + qtdHoraExtra +
                ", valorHoraExtra=" + valorHoraExtra +
                ", totalBonusGanho" + getValorBonus() +
                '}';
    }
}


