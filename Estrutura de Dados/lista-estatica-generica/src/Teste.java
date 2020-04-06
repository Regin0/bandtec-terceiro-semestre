public class Teste {
    public static void main(String[] args) {
        ListaObj<String> lista = new ListaObj<>(5);

        lista.adicionarVetor("A");
        lista.adicionarVetor("B");
        lista.adicionarVetor("C");
        lista.adicionarVetor("D");
        lista.adicionarVetor("E");

        lista.exibe();
        System.out.println(lista.getTamanho());
        System.out.println(lista.getElemento(0));
    }
}
