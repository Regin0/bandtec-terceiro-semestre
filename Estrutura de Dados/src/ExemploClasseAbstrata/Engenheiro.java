package ExemploClasseAbstrata;

public class Engenheiro extends Funcionario {
    //Atributo
    private double salario;

    public Engenheiro(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    //Métodos
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Botando o método abstrato
    @Override
    public double calcSalario() {
        return salario;
    }

    //Método toString();

    @Override
    public String toString() {
        return "Engenheiro{" +
                super.toString() +
                " ,salario=" + String.format("R$ %.2f",salario) +
                '}';
    }
}
