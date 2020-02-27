import java.util.ArrayList;

public class ControleBonus {

    private ArrayList<Funcionario> listarBonus;

    public ControleBonus(){
        listarBonus = new ArrayList<Funcionario>();
    }

    public void adicionaAlgo(Funcionario f){
        listarBonus.add(f);
    }

    public void exibeArray(){
        for(Funcionario f : listarBonus){
            System.out.println(f);
        }
    }

    public Double calcularBonus(){
        double total = 0.0;
        for (Funcionario f : listarBonus){
            total += f.getValorBonus();
        }
        System.out.println("Total de bonus "+total);
        return total;
    }
}
