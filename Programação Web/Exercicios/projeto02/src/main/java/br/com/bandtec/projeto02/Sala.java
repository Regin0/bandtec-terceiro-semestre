package br.com.bandtec.projeto02;

public class Sala {

    private String nome;
    private Integer capacidade;

    public Sala(String nome, Integer capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Integer getCapacidade() {
        return capacidade;
    }
}
