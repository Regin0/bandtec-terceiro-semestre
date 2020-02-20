public class Program {
    public static void main(String[] args) {
        Aluno aluno1 = new AlunoFundamental(8.0, 2.0, 7.0, 9.0);
        Aluno aluno2 = new AlunoGraduacao(9.1, 2.4);
        Aluno aluno3 = new AlunoPos(10.0, 10.0, 9.0);

        Cadastro cadastro1 = new Cadastro();

        cadastro1.adicionaAluno(aluno1);
        cadastro1.adicionaAluno(aluno2);
        cadastro1.adicionaAluno(aluno3);

        cadastro1.exibeTodos();

    }
}
