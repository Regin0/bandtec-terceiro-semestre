public abstract class Aluno {

    protected String nome;
    protected String ra;

    public abstract double calcularMedia();

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ra='" + ra + '\'' +
                '}';
    }

}
