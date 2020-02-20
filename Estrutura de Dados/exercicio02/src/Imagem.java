import java.util.ArrayList;
import java.util.List;

public class Imagem {

    public List <Figura> figuraList = new ArrayList<>();

    public void adicionarFigura (Figura f){figuraList.add(f);};

    public void exibeFiguras(){
        System.out.println(figuraList);
    }
}
