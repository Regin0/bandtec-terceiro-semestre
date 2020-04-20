import java.util.Scanner;

public class Exercicio01 {
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
        int[][] matriz = new int[2][3];
        Scanner leitor = new Scanner(System.in);

        // Loop para preencher os valores da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor de matriz[" + linha +
                        "][" + coluna + "]");
                matriz[linha][coluna] = leitor.nextInt();
            }
        }

        // Loop para exibir os valores da matriz
        exibeMatriz(matriz);
    }
}
