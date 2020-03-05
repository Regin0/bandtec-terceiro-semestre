public abstract class Produto implements Vendavel {
    private int codigo;
    private Double precoCusto;
    private String descricao;

    public Produto(int codigo, Double precoCusto, String descricao) {
        this.codigo = codigo;
        this.precoCusto = precoCusto;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", precoCusto=" + precoCusto +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
