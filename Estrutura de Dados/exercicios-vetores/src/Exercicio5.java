import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        String[] modelos = new String[3];
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < modelos.length; i ++){
            System.out.println("Digite um modelo de um carro:");
            modelos[i] = leitor.next();
        }

        double[] consumos = new double[3];

        for (int i = 0; i < consumos.length; i ++){
            System.out.println("Digite o consumo do carro "+ modelos[i] +":");
            consumos[i] = leitor.nextDouble();
        }

        int cont = 0;
        double consumoMaisEconomico = consumos[0];

        for (int i = 0; i < modelos.length; i ++) {
            if(consumos[i] < consumoMaisEconomico) {
                consumoMaisEconomico = consumos[i];
                cont = i;
            }
        }

        System.out.println("Modelo de carro mais econômico: " + modelos[cont]);
    }
}
