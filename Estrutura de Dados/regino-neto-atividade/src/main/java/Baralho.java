import java.util.Random;

public class Baralho {

    PilhaObj<Carta> baralho = new PilhaObj<Carta>(52);

    public Baralho() {
        this.baralho = baralho;


        String faces[] = {"Ás","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
        String naipes[] ={"Espadas","Paus","Ouros","Copas"};

        int cont= 0;
        while (!baralho.isFull()){
            baralho.push(new Carta(  faces[cont%13],cont%13,naipes[cont/13]));
            cont++;

        }
    }


    public Carta removeCarta(int ind){
        PilhaObj<Carta> aux = new PilhaObj<Carta>(52);
        for (int i = 0; i< ind;i++){
            aux.push((Carta) baralho.pop());
        }
        Carta alvo = (Carta) baralho.pop();
        while (!aux.isEmpty()){
            baralho.push((Carta)aux.pop());
        }
        return alvo;
    }

    public  void embaralhar(){
        Random nroAleatorio = new Random();
        for (int i =0;i<52;  i ++){
            int indice = nroAleatorio.nextInt(52);
            if (indice>=0){
                baralho.push( removeCarta(indice));
            }
        }
    }

    public Carta virarCarta(){
        return (Carta) baralho.pop();
    }


}
