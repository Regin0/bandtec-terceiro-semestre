package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/legal")
// esta anotação faz com que todos os EndPoint aqui
// começem com a URI /legal
public class LegalController {

   @GetMapping
   public List listaSimples() {
       return Arrays.asList("uva", "pêra", "maçã", "cereja");
   }

   @GetMapping("/melhor-aluno")
   public Aluno getMelhorAluno(){
       Aluno melhor = new Aluno(18, "Batman", 190.0);

       return melhor;
   }

   @GetMapping("/todos-alunos")
   public List<Aluno> getTodosAlunos() {
        Aluno a1 = new Aluno(18, "Batman", 190.0);
        Aluno a2 = new Aluno(25, "Aquaman", 140.0);
        Aluno a3 = new Aluno(31, "Wolverine", 70.0);
        Aluno a4 = new Aluno(49, "Goku", 30.0);

        return Arrays.asList(a1, a2, a3, a4);
   }

}
