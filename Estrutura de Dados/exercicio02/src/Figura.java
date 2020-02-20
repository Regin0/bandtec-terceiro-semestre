public abstract class Figura {
    public String cor;
    public  int espessura;

    public abstract double calcularArea();

    @Override
    public String toString() {
        return "Figura{" +
                "cor='" + cor + '\'' +
                ", espessura=" + espessura +
                '}';
    }
}
