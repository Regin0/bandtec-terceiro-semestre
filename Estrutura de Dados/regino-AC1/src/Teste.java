public class Teste {

    public static void main(String[] args) {
        FuncionarioHoraExtra fh = new FuncionarioHoraExtra(1, "Regino", 1800.00
        , 40.5, 25.50);

        FuncionarioHorista fhista = new FuncionarioHorista(2,"Jorge", 70.89
        ,10.75);

        Acionista ac = new Acionista("Apollo", 12, 45.54);

        ControleBonus cb = new ControleBonus();


        cb.adicionaAlgo(fh);
        cb.adicionaAlgo(fhista);
        cb.adicionaAlgo(ac);
        cb.exibeArray();
        cb.calcularBonus();


    }
}
