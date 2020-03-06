import java.util.Arrays;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetorNumeros1 = new int[5];
        int[] vetorNumeros2 = new int[5];
        int[] vetorResultado = new int[10];
        int temp = 0;

        for (int i = 0; i < vetorNumeros1.length; i ++){
            System.out.println("Digite um número:");
            vetorNumeros1[i] = leitor.nextInt();
        }

        for (int i = 0; i < vetorNumeros2.length; i ++){
            System.out.println("Digite um número:");
            vetorNumeros2[i] = leitor.nextInt();
        }

        for (int i = 0; i < vetorNumeros1.length; i++) {
            for (int j = i+1; j < vetorNumeros1.length; j++) {
                if(vetorNumeros1[i] > vetorNumeros1[j]) {
                    temp = vetorNumeros1[i];
                    vetorNumeros1[i] = vetorNumeros1[j];
                    vetorNumeros1[j] = temp;
                }
            }
        }

        temp = 0;

        for (int i = 0; i < vetorNumeros2.length; i++) {
            for (int j = i+1; j < vetorNumeros2.length; j++) {
                if(vetorNumeros2[i] > vetorNumeros2[j]) {
                    temp = vetorNumeros2[i];
                    vetorNumeros2[i] = vetorNumeros2[j];
                    vetorNumeros2[j] = temp;
                }
            }
        }

        for (int i = 0; i < 10; i ++ ){
            if (i % 2 == 0 ){
                vetorResultado[i] = vetorNumeros1[Math.abs(i / 2)];
            }else {
                vetorResultado[i] = vetorNumeros2[Math.abs(i / 2)];
            }
        }


        System.out.println("Vetor 1: \n");
        for (int i = 0; i < vetorNumeros1.length; i ++){
            System.out.println(vetorNumeros1[i]);
        }
        System.out.println("Vetor 2: \n");
        for (int i = 0; i < vetorNumeros2.length; i ++){
            System.out.println(vetorNumeros2[i]);
        }

        System.out.println("Vetor Resultado: \n");
        for (int i = 0; i < vetorResultado.length; i ++){
            System.out.println(vetorResultado[i]);
        }

    }
}
