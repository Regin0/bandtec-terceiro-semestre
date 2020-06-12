import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        int [] v = { -2, 7, -3, -50, 46, 4, -30, 22, 8, -10};
        Scanner leitor = new Scanner(System.in);
        FilaPilha filaPilha = new FilaPilha(v.length);

//        for (int i = 0; i < v.length; i++) {
//            System.out.println("Insira um valor na seguinte posição: " + (i + 1));
//            v[i] = leitor.nextInt();
//        }


        for (int i=0; i < v.length -1; i++) {
            if (v[i] >= 0) {
                filaPilha.insert(v[i]);
            }
            else {
                filaPilha.push(v[i]);
            }
        }


        while (!filaPilha.isFilaEmpty() ) {
            System.out.print(filaPilha.poll() + "\t");
        }


        while (!filaPilha.isPilhaEmpty()) {
            System.out.print(filaPilha.pop() + "\t");
        }

    }

}
//import java.util.Scanner;
//
//public class Teste {
//    public static void main(String[] args) {
//        int[] v = new int[10];
//        Scanner scn = new Scanner(System.in);
//        FilaPilha objeto = new FilaPilha(v.length);
//
//        for (int i = 0; i < v.length; i++){
//            System.out.println("Inisra o valor na posicao"+(i+1));
//            v[i] = scn.nextInt();
//        }
//
////        2, 7, 3, 50, 46, 4, 30, 22, 8, 10
////        2, 7, 3, 4, 8, 10
////        50, 46, 30, 22
//
//        for (int i = 0; i < v.length-1; i++){
//            if (v[i]>=0){
//                objeto.insert(v[i]);
//            }else {
//                objeto.push(v[i]);
//            }
//        }
//        while (!objeto.isFilaEmpty()){
//            System.out.print(objeto.poll()+"\t");
//        }
//
//        while (!objeto.isPilhaEmpty()){
//            System.out.print(objeto.pop()+"\t");
//        }
//    }
//}
