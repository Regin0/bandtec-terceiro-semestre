package br.com.bandtec.corporequisicao.modelo;

public class Virus {
    private String nome_cientifico;
    private String nome_popular;
    private double taxa_mortalidade;

    public String getNome_cientifico() {
        return nome_cientifico;
    }

    public void setNome_cientifico(String nome_cientifico) {
        this.nome_cientifico = nome_cientifico;
    }

    public String getNome_popular() {
        return nome_popular;
    }

    public void setNome_popular(String nome_popular) {
        this.nome_popular = nome_popular;
    }

    public double getTaxa_mortalidade() {
        return taxa_mortalidade;
    }

    public void setTaxa_mortalidade(double taxa_mortalidade) {
        this.taxa_mortalidade = taxa_mortalidade;
    }
}
