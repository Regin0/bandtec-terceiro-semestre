package ExercicioFigura;

public abstract class Figura {
    //Atributos

    private String cor;
    private String espessuraContorno;

    public Figura(String cor, String espessuraContorno) {
        this.cor = cor;
        this.espessuraContorno = espessuraContorno;
    }

    //Métodos

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEspessuraContorno() {
        return espessuraContorno;
    }

    public void setEspessuraContorno(String espessuraContorno) {
        this.espessuraContorno = espessuraContorno;
    }

    public abstract double calculaArea();
}
