public class FuncionarioHorista implements Funcionario {

    private int codigo;
    private String nome;
    private double qtdHoraExtra;
    private double valorHoraExtra;

    public FuncionarioHorista(int codigo, String nome, double qtdHoraExtra, double valorHoraExtra) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtdHoraExtra = qtdHoraExtra;
        this.valorHoraExtra = valorHoraExtra;
    }


    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getQtdHoraExtra() {
        return qtdHoraExtra;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    @Override
    public double getValorBonus() {
        return qtdHoraExtra * valorHoraExtra * 0.10;
    }

    @Override
    public String toString() {
        return "FuncionarioHorista{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", qtdHoraExtra=" + qtdHoraExtra +
                ", valorHoraExtra=" + valorHoraExtra +
                ", totalBonusGanho" + getValorBonus() +
                '}';
    }
}
