public class Livro extends Produto {
    //Atributos
    public String nome;
    public String autor;
    public String isbn;

    //Construtor


    public Livro(int codigo, Double precoCusto, String descricao, String nome, String autor, String isbn) {
        super(codigo, precoCusto, descricao);
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }

    //Métodos
    public double getValorVenda() {
        return getPrecoCusto() *1.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", valorVenda"+ getValorVenda() +
                "} " + super.toString();
    }
}
