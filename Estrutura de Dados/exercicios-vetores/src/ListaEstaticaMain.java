public class ListaEstaticaMain {
    public static void main(String[] args) {
        ListaEstatica listaEstatica = new ListaEstatica(5);

        System.out.println("Adicionando o número 2...");
        listaEstatica.adicionarVetor(2);
        System.out.println("Adicionando o número 3...");
        listaEstatica.adicionarVetor(3);

        System.out.println("\nExibindo...");
        listaEstatica.exibe();

        System.out.println("\nAdicionando o número 1...");
        listaEstatica.adicionarVetor(1);
        System.out.println("Adicionando o número 5...");
        listaEstatica.adicionarVetor(5);

        System.out.println("\nExibindo...");
        listaEstatica.exibe();

        System.out.println("\nAdicionando o número 7...");
        listaEstatica.adicionarVetor(7);

        System.out.println("\nExibindo...");
        listaEstatica.exibe();

        System.out.println("\nBuscando o número 1...");
        System.out.println(listaEstatica.busca(1));

        System.out.println("\nBuscando o número 3...");
        System.out.println(listaEstatica.busca(3));

        System.out.println("\nRemovendo o índice 2...");
        System.out.println(listaEstatica.removePeloIndice(2));

        System.out.println("\nExibindo...");
        listaEstatica.exibe();

        System.out.println("\nTentando remover o índice -1...");
        System.out.println(listaEstatica.removePeloIndice(-1));

        System.out.println("\nExibindo...");
        listaEstatica.exibe();

        System.out.println("\nRemovendo o índice 5...");
        System.out.println(listaEstatica.removePeloIndice(5));

        System.out.println("\nExibindo...");
        listaEstatica.exibe();

        System.out.println("\nRemovendo o 5...");
        System.out.println(listaEstatica.removeElemento(5));

        System.out.println("\nExibindo...");
        listaEstatica.exibe();

        System.out.println("\nTentando remover de novo o 5...");
        System.out.println(listaEstatica.removeElemento(5));

        System.out.println("\nExibindo...");
        listaEstatica.exibe();
    }
}
