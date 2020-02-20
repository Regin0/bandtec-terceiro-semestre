public class Triangulo extends Figura {
    public double baseT;
    public double altura;

    @Override
    public double calcularArea() {
        double calculo =  baseT * altura / 2;
        return calculo;
    }

    public Triangulo(double baseT, double altura) {
        this.baseT = baseT;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "baseT=" + baseT +
                ", altura=" + altura +
                ", cor='" + cor + '\'' +
                ", espessura=" + espessura +
                '}';
    }
}
