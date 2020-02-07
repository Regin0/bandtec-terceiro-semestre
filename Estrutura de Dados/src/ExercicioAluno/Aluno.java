package ExercicioAluno;

public abstract class Aluno {

    //Atributos
    private String nome;
    private String ra;

    //Construtor
    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    //Métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    //Método toString()

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ra='" + ra + '\'' +
                '}';
    }

    public abstract double calculaMedia();
}
