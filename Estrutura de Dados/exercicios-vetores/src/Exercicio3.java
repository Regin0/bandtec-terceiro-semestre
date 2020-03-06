import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i ++){
            System.out.println("Digite um numero:");
            numeros[i] = leitor.nextInt();
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        int media = soma / numeros.length;
        System.out.println("A média é igual a: " + media + "\n");


        System.out.println("Números acima da média: \n");
        for (int numero : numeros) {
            if(numero > media) {
                System.out.println(numero);
            }
        }
    }
}
