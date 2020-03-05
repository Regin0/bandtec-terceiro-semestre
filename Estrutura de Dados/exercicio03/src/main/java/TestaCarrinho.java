import java.util.Scanner;

public class TestaCarrinho {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        Boolean fim = false;
        int codigo;
        double precoCUsto;
        String nome,autor, isbn;
        Scanner leitor = new Scanner(System.in);
        Scanner leitorS = new Scanner(System.in);

        while(!fim){
            System.out.println("Digite um numero de 1 a 6");
            int option = leitor.nextInt();
            switch (option){
                case 1:
                    System.out.println("Adicione o cod do livro");
                    codigo = leitor.nextInt();

                    System.out.println("Qual o preço");
                    precoCUsto = leitor.nextDouble();

                    System.out.println("Desc do livro");
                    String descr = leitorS.nextLine();

                    System.out.println("Digite o nome do livro");
                    nome = leitorS.nextLine();

                    System.out.println("Digite o nome do autor");
                    autor = leitorS.nextLine();

                    System.out.println("Digite o isbn do livro");
                    isbn = leitorS.nextLine();

                    Livro liv = new Livro(codigo, precoCUsto, nome, autor, isbn, descr);
                    carrinho.adicionaVendavel(liv);
                    break;
                case 2:
                    System.out.println("Adicione o cod do DVD");
                    codigo = leitor.nextInt();
                    System.out.println("Qual o preço");
                    precoCUsto = leitor.nextDouble();
                    System.out.println("Desc do DVD");
                    String desc = leitorS.nextLine();
                    System.out.println("Digite o nome do livro");
                    nome = leitorS.nextLine();
                    System.out.println("Qual o autor do livro");
                    autor = leitorS.nextLine();
                    DVD dvd = new DVD(codigo, precoCUsto, desc, nome, autor);
                    carrinho.adicionaVendavel(dvd);
                    break;
                case 3:
                    System.out.println("Nome servico");
                    nome = leitorS.nextLine();
                    System.out.println("Codigo do servico");
                    codigo = leitor.nextInt();
                    System.out.println("Qtd de horas");
                    int horas = leitor.nextInt();
                    System.out.println("Valor da hora");
                    double valorHora = leitor.nextDouble();
                    Servico serv = new Servico(nome, codigo, horas, valorHora);
                    carrinho.adicionaVendavel(serv);
                    break;
                case 4:
                    carrinho.exibeItensCarrinho();
                    leitorS.nextLine();
                    break;
                case 5:
                    System.out.println("Total da venda "+
                    carrinho.calculaTotalVenda());
                    break;
                case 6:
                    fim = true;
                default:
                    System.out.println("Insira um numero valido seu corno");
            }
        }
    }
}
