import java.util.Scanner;

public class Stream {

    /*
    Crie um vetor para armazenar a quantidade em R$ que o usuário
    gostaria de doar, e o nome do Streamer para quem ele gostaria de doar.

    O programa deverá:
        - Solicitar a quantidade que ele gostaria de doar
        - Solicitar o nome do Streamer
        - Exibir o conteúdo dos vetores
        - Calcular o valor total que foi doado para os streamers
        - Exibir o valor total das doações
     */
    Scanner leitor = new Scanner(System.in);
    int qtdNomes = 5;
    int qtdDonation = 5;
    String[] nomes = new String[qtdNomes];

    Double[] donation = new Double[qtdDonation];

    public boolean adicionaStreamerAndDonation() {
        if (qtdNomes > nomes.length || qtdDonation > donation.length) {
            return false;
        }
        for (int i = 0; i < qtdNomes; i++) {
            System.out.println("Insira o nome do streamer");
            nomes[i] = leitor.next();
            System.out.println("Digite o valor de sua doação");
            donation[i] = leitor.nextDouble();
        }
        return true;
    }

    public void exibeStreamers(){
        for (int i = 0; i <qtdNomes ; i++) {
            System.out.println(String.format("Streamer %s : %s ", i,nomes[i]));

        }
        System.out.println();
    }

    public void exibeDonations(){
        for (int i = 0; i < qtdDonation; i++) {
            System.out.println(String.format("Valor da doação %d : R$%.2f",i, donation[i]));

        }
        System.out.println();
    }

    public void exibeTotalDonation(){
        double soma = 0;
        for (int i = 0; i < donation.length; i++) {
            soma = soma + donation[i];
        }
        System.out.println(String.format("Total das doações: R$%.2f", soma));
    }
}
