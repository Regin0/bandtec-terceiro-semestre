package com.example.jpa3.controladores;


import com.example.jpa3.entidades.Aluno;
import com.example.jpa3.repositorios.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    @PostMapping
    public ResponseEntity criarAluno(@RequestBody Aluno novoAluno){
        repository.save(novoAluno);
        return created(null).build();
    }

    @GetMapping
    public ResponseEntity consultarAlunos(
            @RequestParam(required = false) String bairro,
            @RequestParam(required = false) String classe
    ){
        Aluno consulta = new Aluno();
        consulta.setBairro(bairro);
        consulta.setClasseSocial(classe);

        List alunos = repository.findAll(Example.of(consulta));

        return alunos.isEmpty()? noContent().build(): ok(alunos);
    }

    @GetMapping("/simples")
    public ResponseEntity consultarAlunosSimples(){
        List alunos = repository.findAllSimples();

        return alunos.isEmpty() ? noContent().build() : ok(alunos);
    }

    @GetMapping("/classe-media")
    public ResponseEntity consultarClasseMedia(
            @RequestParam(required = false) String bairro
    ){
        List alunos = bairro == null?
                repository.findAllClasseMedia() : repository.findAllClasseMediaBairro(bairro);

        return alunos.isEmpty() ? noContent().build() : ok(alunos);
    }

    @GetMapping("/turma/{id}")
    public ResponseEntity consultarTurma(@PathVariable Integer id){
        List alunos = repository.findByTurmaId(id);

        return alunos.isEmpty() ? noContent().build() : ok(alunos);
    }
}
