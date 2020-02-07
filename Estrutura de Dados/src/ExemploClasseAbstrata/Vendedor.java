package ExemploClasseAbstrata;

public class Vendedor extends Funcionario {
    //Atributos
    private double vendas;
    private double comissao;

    //Construtor
    public Vendedor(String nome, String cpf, double vendas, double comissao) {
        super(nome, cpf);
        this.vendas = vendas;
        this.comissao = comissao;
    }

    //Métodos
    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    //Método calcSalário()
    @Override
    public double calcSalario() {
        return vendas*comissao;
    }

    //Método toString()
    @Override
    public String toString() {
        return "Vendedor{" +
                super.toString() +
                "vendas=" + vendas +
                ", comissao=" + comissao +
                ", salário=" + calcSalario() +
                '}';
    }
}
