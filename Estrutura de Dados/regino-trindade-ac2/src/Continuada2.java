import java.util.Scanner;

public class Continuada2 {

    static String [] bairro;
    static int [][] dengue;
    static int [] variacao;

    public static void main(String[] args) {
        int maxBairro = 0;
        Scanner scn = new Scanner(System.in);

        do {
            try {
                maxBairro = scn.nextInt();
                if ((maxBairro < 7 || maxBairro > 21))
                    throw new Exception();
            }
            catch (Exception e) {
                System.out.println("erro :( ");
            }

        } while (maxBairro < 7 || maxBairro > 21);

        bairro = new String[maxBairro];
        dengue = new int[maxBairro][2];
        variacao = new int[maxBairro];

        for (int i = 0; i < bairro.length; i++) {
            System.out.println("Insira os nomes do " + (i+1) + "º bairro");
            bairro[i] = scn.next();
        }


        for (int l = 0; l < dengue.length; l++){
            for (int c = 0; c < dengue[0].length; c++){
                System.out.println("insira os casos de dengue do " +(l+1) + " bairro");
                dengue[l][c] = scn.nextInt();
            }
            int mesAtual = dengue[l][1];
            int mesAnterior = dengue[l][0];
            variacao[l] = mesAtual- mesAnterior;
        }


        System.out.printf("%-30s%20s%20s%20s\n", "Bairro","Mês Anterior", "Mês Atual", "Variação");
        for (int i = 0; i < bairro.length; i++) {
            System.out.printf("%-30s%20d%20d%20d\n", bairro[i], dengue[i][0], dengue[i][1], variacao[i]);
        }
    }
}
