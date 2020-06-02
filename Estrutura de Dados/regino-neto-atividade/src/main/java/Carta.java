public class Carta {
    private String face;
    private Integer valor;
    private String naipe;


    public Carta(String face, Integer valor, String naipe) {

        if (valor >=1 || valor <=13 && naipe.equals("Copas" )|| naipe.equals("Paus")|| naipe.equals("Ouros")|| naipe.equals("Espadas") ){

            this.face = face;
            this.valor = valor;
            this.naipe = naipe;
        }else{
            System.out.println("valor inserido inválido");
        }

    }


    @Override
    public String toString() {
        return "Carta: "
                + face + " de "+ naipe;
    }


    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }
}
