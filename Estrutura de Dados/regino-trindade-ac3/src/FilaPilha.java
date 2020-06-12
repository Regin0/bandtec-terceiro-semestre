public class FilaPilha {

    private int fila;
    private int pilha;
    private int[] vetorCheio;

    public FilaPilha(int capacidade) {
        this.fila = 0;
        this.pilha = capacidade;
        this.vetorCheio = new int[capacidade];
    }


    public boolean isPilhaEmpty() {
        return pilha == -1;

    }


    public void push(int info) {
        if (!isFull()) {
            vetorCheio[--pilha] = info;
        }
        else {
            System.out.println("Pilha cheia");
        }
    }


    public int pop() {
        if (!isPilhaEmpty()) {
            return vetorCheio[pilha--];

        }
        return -1;
    }


    public void exibePilha() {
        if(isPilhaEmpty()) {
            System.out.println("Pilha vazia");
        }
        else {
            for(int i = 0; i <= pilha; i++) {
                System.out.println(vetorCheio[i]);
            }
        }

    }

    public boolean isFilaEmpty() {
        return fila == 0;
    }

    public boolean isFull() {
        return (fila == pilha -1);
    }

    public void insert(int info) {
        if (isFull()) {
            System.out.println("Fila cheia");
        }
        else {
            vetorCheio[fila++] = info;
        }
    }


    public int peek() {
        return vetorCheio[0];
    }


    public int poll() {
         int first = peek();

        if (!isFilaEmpty()) {

            for (int i = 0; i < fila; i++) {
                vetorCheio[i] = vetorCheio[i + 1];
            }

            fila--;
        }

        return first;
    }


    public void exibeFila() {
        if (isFilaEmpty()) {
            System.out.println("Fila vazia");
        } else {
            for (int i = 0; i < fila; i++) {
                System.out.println(vetorCheio[i]);
            }
        }
    }

}
