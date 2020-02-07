package ExemploClasseAbstrata;

import java.util.ArrayList;

public class Empresa {
    //Atributo
    private ArrayList<Funcionario> lista;

    //Construtor
    public Empresa(){
        lista = new ArrayList<Funcionario>();
    }

    //Métodos
    public void adicionaFunc(Funcionario f){
        lista.add(f);
    }

    public void exibeFunc() {
        System.out.println("\nRelação dos funcionários da empresa: ");
        for (Funcionario f: lista){
            System.out.println(f);
        }
    }

    public void exibeTotalSalario(){
        double total = 0.0;

        for(Funcionario f: lista){
            total += f.calcSalario();
        }

        System.out.println("Total de salário: "+total);
    }
}
