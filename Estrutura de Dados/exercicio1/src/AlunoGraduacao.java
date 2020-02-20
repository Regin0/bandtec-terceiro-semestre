public class AlunoGraduacao extends Aluno {
    public Double nota1;
    public Double nota2;

    public double calcularMedia(){
        return (nota1 + nota2) / 2;
    }

    public AlunoGraduacao(Double nota1, Double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return "AlunoGraduacao{" +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
                '}';
    }


}
