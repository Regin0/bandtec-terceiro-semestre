import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] qtdDiasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
                "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        int diasAcumuladosCheios = 0;

        System.out.println("Digite um dia de 1 a 31");
        int diaEscolhido = leitor.nextInt();

        for(int i = 0; i < qtdDiasPorMes.length; i ++) {
            System.out.println("Dia no ano de "+meses[i]+": "+(diasAcumuladosCheios + diaEscolhido)+"\n");
            diasAcumuladosCheios += qtdDiasPorMes[i];
        }
    }
}
