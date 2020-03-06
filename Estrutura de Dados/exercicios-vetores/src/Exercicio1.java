import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetorNumero = new int[7];

        for (int i = 0; i < 7; i ++) {
            System.out.println("DIgita um numero: ");
            vetorNumero[i] = leitor.nextInt();
        }

        for (int i = 6; i >= 0; i--){
            System.out.println("v["+i+"] = "+vetorNumero[i]);
        }
    }
}
