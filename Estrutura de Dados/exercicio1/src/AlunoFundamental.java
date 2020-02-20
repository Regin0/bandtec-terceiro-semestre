public class AlunoFundamental extends Aluno{
    protected Double nota2;
    protected Double nota1;
    protected Double nota3;
    protected Double nota4;

    public AlunoFundamental(Double nota1, Double nota2, Double nota3, Double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public double calcularMedia(){
         double media = (nota1 + nota2 + nota3 + nota4) / 4;

        return media;
    }

    @Override
    public String toString() {
        return "AlunoFundamental{" +
                "nota2=" + nota2 +
                ", nota1=" + nota1 +
                ", nota3=" + nota3 +
                ", nota4=" + nota4 +
                '}';
    }
}



