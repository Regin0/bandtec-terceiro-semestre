package com.example.jpa4clienterest.entidades;

import javax.persistence.*;

@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String nome;

    @Column(nullable = false)
    private Integer ano;

    @ManyToOne()
    private CategoriaFilme categoria;

    @Column(length = 200)
    private String obs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public CategoriaFilme getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaFilme categoria) {
        this.categoria = categoria;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
