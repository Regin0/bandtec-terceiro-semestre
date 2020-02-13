package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private List<Aluno> lista = new ArrayList<>();

    public AlunoController() {
        lista.add(new Aluno(1, "José", 100.0));
        lista.add(new Aluno(2, "Maria", 120.0));
        lista.add(new Aluno(3, "João", 80.0));
    }

    @GetMapping
    public List<Aluno> getLista() {
        return lista;
    }

    @GetMapping("/contagem")
    public Integer getContagem() {
        return lista.size();
    }

    @GetMapping("/excluir/{id}") // indice da lista, do 0 a 2
    public void excluir(@PathVariable("id") int indice) {
        lista.remove(indice);
    }
}
