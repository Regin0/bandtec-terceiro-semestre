import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.baralho.exibe();
        baralho.embaralhar();
        System.out.println("-----------------------------------------");
        baralho.baralho.exibe();
        System.out.println("-----------------------------------------");
        Scanner leitor = new Scanner(System.in);
        boolean loop = false;
        int quantCartas = 0;
        while (!loop){
            System.out.println("Digite a quantidade de cartas a serem viradas: ");
            quantCartas = leitor.nextInt();
            if (quantCartas>=2 && quantCartas<=12){
                loop= true;
            }else{
                System.out.println("A quantidade de cartas deve ser de 2 a 12!");
            }
        }
        loop = false;
        int quantPreto = 0;
        while (!loop){
            System.out.println("Adivinhe quantas cartas serao de naipe preto (espada e paus): ");
            quantPreto = leitor.nextInt();
            if (quantPreto>=0 && quantPreto<=quantCartas){
                loop = true;
            }else{
                System.out.println("Digite um numero de 0 a "+quantCartas);
            }
        }
        System.out.println("VIRANDO CARTAS...");
        int qtdPretoVirada = 0;
        for (int i =0; i<quantCartas; i++){
            Carta virada = baralho.virarCarta();
            System.out.println(virada.toString());
            if (virada.getNaipe().equals("Espadas") || virada.getNaipe().equals("Paus")){
                qtdPretoVirada++;
            }
        }
        System.out.println("-----------------------------------------");
        if (quantPreto == qtdPretoVirada){
            System.out.println("Voce ganhou! Acertou a quantidade de pretos virados");
        }else{
            System.out.println("Voce perdeu! Errou a quantidade de pretos virados");
            System.out.println("A quantidade de pretos virados foi: "+qtdPretoVirada);
        }
    }
}
