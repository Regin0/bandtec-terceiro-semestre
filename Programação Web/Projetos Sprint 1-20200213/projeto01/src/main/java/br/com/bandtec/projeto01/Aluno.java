package br.com.bandtec.projeto01;

public class Aluno {

    private Integer id;
    private String nome;
    private Double qi;

    public Aluno(Integer id, String nome, Double qi) {
        this.id = id;
        this.nome = nome;
        this.qi = qi;
    }

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

    public Double getQi() {
        return qi;
    }

    public void setQi(Double qi) {
        this.qi = qi;
    }
}
