public class AlunoPos extends Aluno {
    public double nota1;
    public double nota2;
    public double notaMonografia;

    public double calcularMedia(){
        double media = (nota1 + nota2 + notaMonografia) / 3;
        return media;
    }

    public AlunoPos(double nota1, double nota2, double notaMonografia) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    @Override
    public String toString() {
        return "AlunoPos{" +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", notaMonografia=" + notaMonografia +
                '}';
    }
}
