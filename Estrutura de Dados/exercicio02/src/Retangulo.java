public class Retangulo extends Figura {
    public double baseR;
    public double altura;

    @Override
    public double calcularArea() {
        double calculo = baseR * altura;
        return calculo;
    }

    public Retangulo(double baseR, double altura) {
        this.baseR = baseR;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "baseR=" + baseR +
                ", altura=" + altura +
                ", cor='" + cor + '\'' +
                ", espessura=" + espessura +
                '}';
    }
}
