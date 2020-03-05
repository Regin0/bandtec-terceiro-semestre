import java.util.Scanner;

public class ExemploVetor {

    public static void exibeVetor(int[]v){
        for (int i = 0; i <v.length ; i++) {
            System.out.println("vet[" + i + "]=" + v[i]);
        }

    }

    public static void main(String[] args) {
        int [] vet = new int[5];
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i <vet.length ; i++) {
            System.out.println("Digite um numero");
            vet[i] = leitor.nextInt();

        }

        exibeVetor(vet);

    }
}


