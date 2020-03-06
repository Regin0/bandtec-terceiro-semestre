import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i ++){
            System.out.println("Digite um nome:");
            nomes[i] = leitor.next();
        }

        System.out.println("Agora digite um nome qualquer: ");
        String nomeDigitado = leitor.next();

        boolean nomeEncontrado = false;
        for (int i = 0; i < nomes.length; i ++) {
            if(nomes[i].equals(nomeDigitado)) {
                nomeEncontrado = true;
                System.out.println("Nome encontrado no índice " + i);
            }
        }

        if(!nomeEncontrado) {
            System.out.println("Nome não encontrado");
        }
    }
}
