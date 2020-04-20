import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
    public static void exibeMatriz(int[][] m) {
        // Loop para exibir os valores da matriz
        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                System.out.print(m[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner leitor = new Scanner(System.in);

        int[][] matrizA = new int[2][3];
        int[][] matrizB = new int[2][3];
        int[][] matrizC = new int[2][3];
    }
}
