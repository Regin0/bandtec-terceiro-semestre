import java.util.ArrayList;

public class ControleBonus implements  Bonus{

    private ArrayList<Bonus> listarBonus;

    @Override
    public double getValorBonus() {
        return 0;
    }

    public ControleBonus(){
        listarBonus = new ArrayList<Bonus>();
    }

    public void adicionaAlgo(Bonus b){
        listarBonus.add(b);
    }

    public void exibeArray(){
        for(Bonus b : listarBonus){
            System.out.println(b);
        }
    }

    public Double calcularBonus(){
        double total = 0.0;
        for (Bonus b : listarBonus){
            total += getValorBonus();
        }
        return total;
    }
}
