import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    public List<Aluno> alunoList = new ArrayList<>();

    public void adicionaAluno(Aluno a){
        alunoList.add(a);
    }

    public void exibeTodos() {
        System.out.println(alunoList);
    }
}
