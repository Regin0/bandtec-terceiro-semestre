import java.util.Scanner;

public class Main {
    static String[] aluno;
    static double[][] notas;
    static double[] media = new double[2];

    public static void main(String[] args) {

        int maxAluno = 0;
        Scanner scn = new Scanner(System.in);

        do {
            try {
                maxAluno = scn.nextInt();
                if ((maxAluno < 5 || maxAluno > 15))
                    throw new Exception();
            }
            catch (Exception e) {
                System.out.println("erro mermao");
            }

        } while (maxAluno < 5 || maxAluno > 15);

        aluno = new String[maxAluno];
        notas = new double[maxAluno][2];

        for (int i = 0; i < aluno.length; i++) {
            System.out.println("Insira os nomes do " + (i+1) + "º aluno");
            aluno[i] = scn.next();
        }

        for (int l = 0; l < notas.length; l++){
            for (int c = 0; c < notas[0].length; c++){
                System.out.println("insira as notas da C"+(c+1)+" do "+aluno[l]);
                notas[l][c] = scn.nextDouble();

                media[c] += (notas[l][c])/5;
            }
        }

        System.out.printf("%-30s%20s%20s\n", "NOME DO ALUNO", "NOTAS DA C1", "NOTAS DA C2");
        for (int i = 0; i < aluno.length; i++) {
            System.out.printf("%-30s%20.2f%20.2f\n", aluno[i], notas[i][0], notas[i][1]);
        }
        System.out.printf("%-30s%20.2f%20.2f\n", "MEDIA:", media[0], media[1]);
    }
}
