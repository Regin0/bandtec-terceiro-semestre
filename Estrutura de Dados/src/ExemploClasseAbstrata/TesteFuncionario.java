package ExemploClasseAbstrata;

public class TesteFuncionario {

    public static void main(String[] args) {
       Engenheiro e = new Engenheiro("Regino", "37895484800", 20000);
       Vendedor v = new Vendedor("Marcio", "78965425800", 50000, 0.10);
       Horista h = new Horista("Jorge", "40028922", 40, 200);

        System.out.println(e);
        System.out.println(v);
        System.out.println(h);

        Empresa emp = new Empresa();
        emp.adicionaFunc(e);
        emp.adicionaFunc(v);
        emp.adicionaFunc(h);

        emp.exibeTotalSalario();
        emp.exibeTotalSalario();
    }
}
