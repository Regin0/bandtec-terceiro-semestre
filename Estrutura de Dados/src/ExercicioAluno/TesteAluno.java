package ExercicioAluno;

public class TesteAluno {

    public static void main(String[] args) {
        AlunoFundamental af = new AlunoFundamental("01191099", "Regino", 9.7
        , 8.5,7.9,9.9);
        AlunoGraduacao ag = new AlunoGraduacao("Ademir", "01191015", 5.0, 4.3);
        AlunoPos ap = new AlunoPos("Badernah", "011910780", 7.7, 8.7, 9.9);

        System.out.println(af);
        System.out.println(ag);
        System.out.println(ap);
    }
}
