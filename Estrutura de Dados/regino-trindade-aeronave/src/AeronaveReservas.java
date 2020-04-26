import java.util.Scanner;

public class AeronaveReservas {
    static int assento;
    static int indicador;
    static int maxFileiras;
    static int maxAssentos;
    static int numLinha;
    static int opt;
    static boolean[][] mapaDeAssentos;
    static char linha;
    static String fileira;
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            try {
                System.out.println("Digite a quantidade de fileiras que a aeronave tem");
                maxFileiras = scn.nextInt();
                if ((maxFileiras < 4 || maxFileiras > 9))
                    throw new Exception("Valor invalido");
            }
            catch (Exception e) {
                System.out.println(e);
            }

        } while (maxFileiras < 4 || maxFileiras > 9);

        do {
            try {
                System.out.println("Digite a quantidade de assentos de uma fileira");
                maxAssentos = scn.nextInt();
                if ((maxAssentos < 15 || maxAssentos > 20))
                    throw new Exception("Valor invalido");
            }
            catch (Exception e) {
                System.out.println(e);
            }

        } while (maxAssentos < 15 || maxAssentos > 20);

        mapaDeAssentos = new boolean[maxFileiras][maxAssentos];

        do{
            linha = 65;
            System.out.println(
                    "\n1. Exibir o mapa de assento\n" +
                            "2. Reservar assento\n" +
                            "3. Exibir assentos livres de uma fileira\n" +
                            "4. Sair\n");
            opt = scn.nextInt();

            switch (opt){
                case 1:
                    System.out.print("  ");
                    for (int c = 0; c < mapaDeAssentos[0].length; c++)     {
                        System.out.printf("%-8d",(c+1));
                    }
                    System.out.print("\n");
                    for (boolean[] mapaDeAssento : mapaDeAssentos) {
                        System.out.printf("%c ", linha++);
                        for (int c = 0; c < mapaDeAssentos[0].length; c++) {
                            System.out.printf("%-7s ", exibe(mapaDeAssento[c]));
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Digite a letra de uma fileira");
                    fileira = scn.next();
                    numLinha = fileira.charAt(0) - 'A';

                    System.out.println("Digite o número do assento");
                    assento = scn.nextInt();

                    if (exibe(mapaDeAssentos[numLinha][assento-1]).equals("ocupado")){
                        System.out.println("Este assento já está ocupado");
                    }else if(exibe(mapaDeAssentos[numLinha][assento-1]).equals("livre")){
                        System.out.println("Reserva efetuada com sucesso");
                        mapaDeAssentos[numLinha][assento-1] = true;
                    }
                    break;
                case 3:
                    System.out.println("Digite a letra de uma fileira");
                    fileira = scn.next();
                    numLinha = fileira.charAt(0) - 'A';
                    if (numLinha>maxFileiras){
                        System.out.println("Fileira inválida!");
                    }else {
                        System.out.println();
                        for (int c = 0; c < mapaDeAssentos[0].length; c++)     {
                            if (!mapaDeAssentos[numLinha][c]){
                                System.out.printf("%-8d",(c+1));
                                indicador++;
                            }else{
                                System.out.println("Não há assentos livres nessa fileira");
                                return;
                            }
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    return;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while (true);
    }

    private static String exibe(boolean b) {
        if (b){
            return "ocupado";
        }else{
            return "livre";
        }
    }
}
