import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qntdAlunos = 3;
        String [] alunosT1 = new String[qntdAlunos];
        String [] alunosT2 = new String[qntdAlunos];

        int contT1 = 0;
        int contT2 = 0;

        for (int i = 0; i < qntdAlunos; i++) {
            System.out.println("Digite um nome: ");
            String nomeAluno = leitor.next();
            System.out.println("Informa a turma dele: ");
            String turmaAluno = leitor.next();

            if(turmaAluno.equalsIgnoreCase("t1")){
                alunosT1[contT1] = nomeAluno;
                contT1++;
            }else if(turmaAluno.equalsIgnoreCase("t2")){
                alunosT2[contT2] = nomeAluno;
                contT2++;
            }else{
                System.out.println("Turma inválida, insira apenas t1 ou t2");
            }

        }
            System.out.println("Classe T1 tem "+contT1 + " alunos.");

            for (int i = 0; i < qntdAlunos; i++) {
                if(alunosT1[i] != null){
                    System.out.println("Alunos na T1 " + alunosT1[i]);
                }
            }

            System.out.println("Classe T2 tem "+contT2 + " alunos.");

            for (int i = 0; i < qntdAlunos; i++) {
                if(alunosT2[i] != null){
                    System.out.println("Alunos na T2 " + alunosT2[i]);
                }
            }

    }
}
