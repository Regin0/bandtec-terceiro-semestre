public class Main {

    public static void main(String[] args) {
        Professor prof = new Professor("Brandão", 5, 25.50);
        Coordenador coord = new Coordenador("Gerson", 2.5, 85.40);
        ControleBonus cb = new ControleBonus();

        cb.adicionaAlgo(prof);
        cb.adicionaAlgo(coord);
        cb.calcularBonus();
        cb.exibeArray();
        cb.getValorBonus();

    }
}
