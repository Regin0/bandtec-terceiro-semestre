public class Quadrado extends Figura {
    public double lado;

    @Override
    public double calcularArea() {
        double calculo = lado * 2;
        return calculo;
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                ", cor='" + cor + '\'' +
                ", espessura=" + espessura +
                '}';
    }
}
