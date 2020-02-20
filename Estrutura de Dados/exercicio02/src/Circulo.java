public class Circulo extends Figura {
    public double raio;

    @Override
    public double calcularArea() {
         double calculo = Math.PI * raio * raio;
         return calculo;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", cor='" + cor + '\'' +
                ", espessura=" + espessura +
                '}';
    }
}