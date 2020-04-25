package com.example.jpa3.repositorios;

import com.example.jpa3.entidades.Aluno;
import com.example.jpa3.modelos.AlunoSimples;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    @Query("select new com.example.jpa3.modelos.AlunoSimples(a.id, a.nome) from Aluno a")
    List<AlunoSimples> findAllSimples();

    @Query("select a from Aluno a where a.classeSocial in ('A', 'B')")
    List<Aluno> findAllClasseMedia();

    @Query("select a from Aluno a where a.classeSocial in ('A', 'B') and a.bairro = ?1")
    List<Aluno> findAllClasseMediaBairro(String bairro);

    @Transactional
    @Modifying
    @Query("delete from Aluno a where a.classeSocial is null and a.bairro is null and a.nascimento is null")
    void deleteIncompletos();

    List<Aluno> findByTurmaId(int idTurma);

    long countByTurmaId(int idTurma);

    void deleteByTurmaId(int idTurma);

    void deleteByTurmaIsNull(int idTurma);
}
