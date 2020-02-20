import java.util.ArrayList;

public class Carrinho {

    //Atributo
    private ArrayList<Vendavel> listaCar;

    //Construtor
    public Carrinho() {listaCar = new ArrayList<Vendavel>(); }

    public void adicionaVendavel(Vendavel v) {listaCar.add(v);}

    public double calculaTotalVenda(){
        double total = 0.0;
        for (Vendavel v : listaCar) {
            total += v.getValorVenda();
        }
        return total;
    }

    public void exibeItensCarrinho(){
        for(Vendavel ve: listaCar){
            System.out.println(ve);
        }
    };
}

