public class ListaEstatica {

    private int[] vetor;
    private int nroElem;

    public ListaEstatica(int nroElem) {
        this.vetor = new int[nroElem];
        this.nroElem = 0;
    }

    public boolean adicionarVetor(int elemento) {
        if (nroElem >= vetor.length) {
            return false;
        }
        vetor[nroElem++] = elemento;
        return true;
    }

    public void exibe(){
        for (int i = 0; i <nroElem ; i++) {
            System.out.println(String.format("Item %d : %d ", i,vetor[i]));
        }
    }

    public int[] getVetor(){
        return vetor;
    }

    public int getNroElem(){
        return nroElem;
    }

    public int busca(int elemento){
        int indice = -1;

        for(int i = 0; i < nroElem; i++) {
            if(vetor[i] == elemento){
                indice = i;
            }
        }

        return indice;
    }

    public boolean removePeloIndice(int indice){
        if(indice < 0 || indice > nroElem){
            return false;
        }

        vetor[indice] = 0;

        for (int i = indice +1; i < nroElem; i ++) {
            vetor[i - 1] = vetor[i];
        }

        nroElem --;

        return true;
    }

    public boolean removeElemento (int elemento) {
        int indice = busca(elemento);

        boolean removeu = removePeloIndice(indice);

        return removeu;
    }
}
